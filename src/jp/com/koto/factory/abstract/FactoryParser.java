package factory;

import java.io.File;
import java.net.URI;
import java.net.URL;

public abstract class FactoryParser {

    protected URI uri;

    protected URL url;

    protected File file;

    protected abstract void setUri(URI uri);

    protected abstract void serUrl(URL url);

    protected abstract void setFile(File file);

    protected InterfaceParser create() {
        return new DefaultParser();
    }

    protected FactoryParser() {}

    protected class DefaultParser implements InterfaceParser {
        @Override
        public void parser() {}

        public DefaultParser() {}
    }

    public interface InterfaceParser {
        void parser();
    }
}
