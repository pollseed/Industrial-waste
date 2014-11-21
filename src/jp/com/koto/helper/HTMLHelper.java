import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLHelper extends AbstractHTML {
    public HTMLHelper(File file, Encoding encoding) {
        super(file, encoding);
    }

    // TODO parser unit.
    @Override
    public void parser() {
        try {
            Document doc = Jsoup.parse(file, "UTF-8");
            html = doc.html();
            tag = doc.tag();
            title = doc.title();
            head = doc.head();
            body = doc.body();
            text = doc.text();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
