package solid.live.dip;
import java.io.*;

public class TextReader implements Reader {
    private String file;

    public TextReader(String file) {
        this.file = file;
    }
    
    public String read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                sb.append(aLine);
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}