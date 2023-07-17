package Files;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("files\\testFile.txt");
        if(!file.exists()){
            boolean fileCreated = file.createNewFile();
            System.out.println("Wynik utworezenia " + fileCreated);
        }else{
            System.out.println("Plik istnieje");
        }
        System.out.println("Czytanie "+ file.canRead());
        System.out.println("zapisac "+ file.canWrite());
        System.out.println("zwyjly "+ file.isFile());
        System.out.println("jest kalatogiem "+ file.isDirectory());
        System.out.println("nazwa "+file.getName());
        System.out.println("w którym jest "+file.getParent());
        System.out.println("Path "+ file.getPath());
        System.out.println("absolute "+file.getAbsoluteFile());

        System.out.println("ukryty "+ file.isHidden());

        long lastModified = file.lastModified();
        System.out.println((new Date(lastModified)) +" ostatnia modyfikacja");

        System.out.println("wielkosc "+ file.length());
        System.out.println("\n");
        File filesdir = new File("files");
        if(filesdir.exists()){
            String files[] = filesdir.list();
            for (String f:files
                 ) {
                System.out.println(f);
            }


        }
    }
}
