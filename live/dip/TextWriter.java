package solid.live.dip;
import java.io.*;

public class TextWriter implements Writer {
    private String file;

    public TextWriter(String file) {
        this.file = file;
    }

    public void write(String encodedLines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(encodedLines);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}