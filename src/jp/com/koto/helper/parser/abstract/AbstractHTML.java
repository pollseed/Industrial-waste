import java.io.File;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

public abstract class AbstractHTML implements IHTML {

    /* valuable area. */

    protected final File file;
    protected final String defaultEncoding;
    protected String html;
    protected Tag tag;
    protected Element head;
    protected String title;
    protected Element body;
    protected String text;

    /* enum area. */

    public enum Encoding {
        UFF_8(10, "UTF-8"),
        SHIF_JIS(20, "SHIFT_JIS");
        Integer value;
        String name;

        private Encoding(Integer value, String name) {
            this.value = value;
            this.name = name;
        }
    }

    /* constructor area. */

    protected AbstractHTML(File file, Encoding encoding) {
        validation(file, encoding);
        this.file = file;
        this.defaultEncoding = encoding.name;
    }

    /* method area. */

    public String html() {
        return html;
    }

    public Tag tag() {
        return tag;
    }

    public Element head() {
        return head;
    }

    public String title() {
        return title;
    }

    public Element body() {
        return body;
    }

    public String text() {
        return text;
    }

    // TODO check the file is 'HTML'.
    private void validation(File file, Encoding encoding) {
        if (null == file) {
            throw new IllegalArgumentException("file is null");
        } else if (!file.isFile()) {
            throw new IllegalArgumentException("file type error");
        }
        if (null == encoding) {
            throw new IllegalArgumentException("encoding is null");
        } else {
            switch (encoding) {
            case UFF_8:
                break;
            case SHIF_JIS:
                break;
            default:
                throw new IllegalArgumentException("encoding type error");
            }
        }
    }
}
