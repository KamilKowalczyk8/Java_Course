package thread.Lifecycle;

import java.sql.SQLOutput;

public class NewThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("workubg thread");
            }
        });
        //thread.start
        System.out.println(thread.getState());
    }
}
