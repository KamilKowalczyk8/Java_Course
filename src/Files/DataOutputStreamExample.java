package Files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")
                    ));
            out.writeUTF("Trstowy birnany");
            out.writeBoolean(true);
            out.writeLong(12134214124L);
            out.writeFloat(23.54f);
            out.writeChar('V');
            out.flush();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out !=null) out.close();
        }
    }
}
