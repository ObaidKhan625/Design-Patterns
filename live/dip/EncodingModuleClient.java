package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Reader reader = new TextReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        Writer writer = new TextWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
        EncodingModule encodingModule  = new EncodingModule(reader, writer);
        encodingModule.encode();
    }
}
