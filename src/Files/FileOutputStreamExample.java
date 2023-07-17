package Files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args)
        throws IOException{
        char chars[] = {'Q','W','E','R','T','Y','U','I','T','T'};
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("test.txt");
            for(char c: chars){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out !=null) out.close();
        }
    }
}
