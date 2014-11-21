import java.io.File;

import rss.AbstractHTML;
import rss.AbstractHTML.Encoding;
import rss.HTMLHelper;

public class HowToUse {

    public static void main(String[] args) {
        AbstractHTML html = new HTMLHelper(new File("hogehoge.html"), Encoding.UFF_8);
        html.parser();
    }
}
