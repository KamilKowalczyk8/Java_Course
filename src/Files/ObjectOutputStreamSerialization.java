package Files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamSerialization {
    public static void main(String[] args) throws IOException {

        CarObject car1 = new CarObject("Camaro","Ford",1970,200,1);
        CarObject car2 = new CarObject("Golf","VW",2000,180,2);
        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("files\\cars.dat")));

        out.writeObject(car1);
        out.writeObject(car2);
        out.flush();
        out.close();


    }
}
