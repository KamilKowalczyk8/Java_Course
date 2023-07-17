package date;

import java.util.Date;
public class CodeTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try{
            for(int a = 10; a>0 ; a--){
                System.out.println(new Date().getTime());
                Thread.sleep(5);
            }
        }catch(InterruptedException exception){
            exception.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long timeElapsed = end - start;
        System.out.println("Time "+timeElapsed);
    }
}
