package solid.live.dip;

public class DBWriter implements Writer {

    public DBWriter() {
    }

    public void write(String encodedString) {
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}