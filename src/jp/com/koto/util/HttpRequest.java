import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.ws.http.HTTPException;

public class HttpRequest extends HttpURLConnection {

    protected HttpRequest(URL u, int timeout) {
        super(u);
        setConnectTimeout(timeout);
    }

    protected HttpRequest(URL u, int timeout, boolean doinput, boolean usecaches) {
        this(u, timeout);
        setDoInput(doinput);
        setUseCaches(usecaches);
    }

    @Override
    public void disconnect() {
        throw new HTTPException(HTTP_BAD_GATEWAY);
    }

    @Override
    public boolean usingProxy() {
        throw new HTTPException(HTTP_BAD_GATEWAY);
    }

    @Override
    public void connect() throws IOException {
        if (super.connected) {
            return;
        }
        // TODO
        // 未実装
    }
}
