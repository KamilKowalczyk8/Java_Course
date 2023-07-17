package Files;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")
                    ));
            String str = in.readUTF();
            System.out.println(str);
           /* in.writeUTF("Trstowy birnany");
            out.writeBoolean(true);
            out.writeLong(12134214124L);
            out.writeFloat(23.54f);
            out.writeChar('V');
            out.flush();*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
        }
    }
}
