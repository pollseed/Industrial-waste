package jp.com.koto.rule;

/**
 * Uniform Resource Identifiers (URI): Generic Syntax<br>
 * Request for Comments: 2396
 * @since 1998/8
 * @author PollSeed
 */
public class RFC2396 {

    public static enum URIGenericSyntaxStandards {
        RESERVED("reserved", "[;|/|?|:|@|&|=|+|$|,]"),
        MARK("mark", "-|_|.|!|~|*|'|1523.(|)"),
        LOW_ALPHA("lowalpha", "a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z"),
        UP_ALPHA("upalpha", "A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z"),
        DIGIT("digit", "0|1|2|3|4|5|6|7|8|9"),
        HEX_WORDS("hexwords", "A|B|C|D|E|F|a|b|c|d|e|f"),
        PCHAR("pchar", ":|@|&|=|+|$|,"),
        URIC_NO_SLASH("uricnoslash", ";|?|:|@|&|=|+|$|,"),
        USER_INFO("userinfo", ";|:|&|=|+|$|,"),
        REG_NAME("regname", "$|,|;|:|@|&|=|+"),
        SCHEME("scheme", "+|-|."),
        REL_SEGMENT("relsegment", ";|@|&|=|+|$|,"), ;

        private String name;
        private String syntax;

        URIGenericSyntaxStandards(String name, String syntax) {
            this.name = name;
            this.syntax = syntax;
        }

        public String getSyntax() {
            return syntax;
        }

        public String getName() {
            return name;
        }
    }

    /* Collected BNF for URI  */
    public static final String HEX = URIGenericSyntaxStandards.DIGIT.getSyntax() + "|" + URIGenericSyntaxStandards.HEX_WORDS.getSyntax();
    public static final String ESCAPED = "%" + URIGenericSyntaxStandards.HEX_WORDS.getSyntax() + URIGenericSyntaxStandards.HEX_WORDS.getSyntax();
    public static final String ALPHA = URIGenericSyntaxStandards.LOW_ALPHA.getSyntax() + "|" + URIGenericSyntaxStandards.UP_ALPHA.getSyntax();
    public static final String ALPHA_NUM = ALPHA + "|" + URIGenericSyntaxStandards.DIGIT.getSyntax();
    public static final String UN_RESERVED = ALPHA_NUM + "|" + URIGenericSyntaxStandards.MARK.getSyntax();
    public static final String URIC = URIGenericSyntaxStandards.RESERVED.getSyntax() + "|" + UN_RESERVED + "|" + ESCAPED;
    public static final String FRAGMENT = "*" + URIC;
    public static final String QUERY = "*" + URIC;
    public static final String P_CHAR = UN_RESERVED + "|" + ESCAPED + "|" + URIGenericSyntaxStandards.PCHAR.getSyntax();
    public static final String PARAM = "*" + P_CHAR;
    public static final String SEGMENT = "*" + P_CHAR + "*" + "(\":\"" + PARAM + ")";
    public static final String PATH_SEGMENTS = SEGMENT + "*( \"/\"" + SEGMENT + ")";
    public static final String ABS_PATH = "/" + PATH_SEGMENTS;
    public static final String OPAQUE_PART = UN_RESERVED + "|" + ESCAPED + URIGenericSyntaxStandards.REL_SEGMENT.getSyntax() + "*" + URIC;
    public static final String PATH = "[" + ABS_PATH + OPAQUE_PART;
    public static final String PORT = "*" + URIGenericSyntaxStandards.DIGIT.getSyntax();

    private static final String REPEAT_IP_V4_ADDRESS = "1*" + URIGenericSyntaxStandards.DIGIT.getSyntax() + ".";
    public static final String IP_V4_ADDRESS = REPEAT_IP_V4_ADDRESS + "\".\"" + REPEAT_IP_V4_ADDRESS + "\".\"" + REPEAT_IP_V4_ADDRESS + "\".\""
            + REPEAT_IP_V4_ADDRESS;
    public static final String TOP_LABEL = ALPHA + "|" + ALPHA + "*(" + ALPHA_NUM + "|\"-\")" + ALPHA_NUM;
    public static final String DOMAIN_LABEL = ALPHA_NUM + "|" + ALPHA_NUM + "*(" + ALPHA_NUM + "|\"-\")" + ALPHA_NUM;
    public static final String HOST_PORT = "*(" + DOMAIN_LABEL + "\".\")" + TOP_LABEL + "[\".\"]";
    public static final String HOST = "[\":\"" + PORT + "]";
    public static final String USER_INFO = "*(" + UN_RESERVED + "|" + ESCAPED + "|" + URIGenericSyntaxStandards.USER_INFO.getSyntax() + ")";
    public static final String SERVER = "[[" + URIGenericSyntaxStandards.USER_INFO.getSyntax() + "\"@\"]" + HOST_PORT + "]";
    public static final String REG_NAME = "1*(" + UN_RESERVED + "|" + ESCAPED + "|" + URIGenericSyntaxStandards.REG_NAME.getSyntax() + ")";
    public static final String AUTHORITY = SERVER + "|" + REG_NAME;
    public static final String SCHEME = ALPHA + "*(" + ALPHA + "|" + URIGenericSyntaxStandards.DIGIT.getSyntax() + "|"
            + URIGenericSyntaxStandards.SCHEME.getSyntax() + ")";
    public static final String REL_SEGMENT = "1*(" + UN_RESERVED + "|" + ESCAPED + "|" + URIGenericSyntaxStandards.REL_SEGMENT.getSyntax() + ")";
    public static final String REL_PATH = REL_SEGMENT + "[" + AUTHORITY + "]";
    public static final String NET_PATH = "//" + AUTHORITY + "[" + ABS_PATH + "]";
    public static final String URIC_NO_SLASH = UN_RESERVED + "|" + ESCAPED + "|" + URIGenericSyntaxStandards.URIC_NO_SLASH.getSyntax();
    public static final String HIER_PART = "(" + NET_PATH + "|" + ABS_PATH + ")[\"?\"" + QUERY + "]";
    public static final String RELATIVE_URI = "(" + NET_PATH + "|" + ABS_PATH + "|" + REL_PATH + ")[\"?\"" + QUERY + "]";
    public static final String ABSOLUTE_URI = SCHEME + "\":\"(" + HIER_PART + "|" + OPAQUE_PART + ")";
    public static final String URI_REFERENCE = "[" + ABSOLUTE_URI + "|" + RELATIVE_URI + "][\"#\"" + FRAGMENT;

}
