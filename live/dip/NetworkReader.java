package solid.live.dip;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements Reader {
    private String url;

    public NetworkReader(String url) {
        this.url = url;
    }

    public String read() {
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
            return inputString1.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}