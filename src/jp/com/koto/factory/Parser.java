package factory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.commons.lang.NullArgumentException;
import org.apache.commons.lang3.StringUtils;

import file.FileParser;

public class Parser extends FactoryParser {
    public static final FactoryParser parser = new Parser();

    public static InterfaceParser singletonCreateInstance() {
        return parser.create();
    }
    
    public InterfaceParser create() {
        return new IndividualParser(null, null, new File("piyo"));
    }

    private Parser() {}

    public class IndividualParser implements InterfaceParser {
        @Override
        public void parser() {
            FileParser parser = new FileParser(file.getPath(), 0);
            parser.parse(file);
        }

        public IndividualParser(URI uri, URL url, File file) {
            if (uri != null) {
                setUri(uri);
            }
            if (url != null) {
                serUrl(url);
            }
            if (file != null) {
                setFile(file);
            }
            raterValidation();
        }
    }

    @Override
    protected void setUri(URI uri) {
        super.uri = uri;
    }

    @Override
    protected void serUrl(URL url) {
        super.url = url;
    }

    @Override
    protected void setFile(File file) {
        super.file = file;
    }

    private boolean raterValidation() {
        final boolean nullPointerException = super.uri == null || super.url == null || super.file == null;
        if (nullPointerException)
            throw new NullArgumentException("uri and url, file");

        boolean illegalArgumentException = false;
        try {
            illegalArgumentException = !super.uri.toURL().equals(url)
                    || StringUtils.isBlank(super.url.getFile())
                    || !file.exists()
                    || !file.isFile();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (illegalArgumentException)
                throw new IllegalArgumentException();
        }
        return true;
    }
}
