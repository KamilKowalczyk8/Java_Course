package thread.Lifecycle;

import java.sql.SQLOutput;

public class TerminatedThread {
    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Threrad run");
            }
        });
        thread.start();
        Thread.sleep(100);
        System.out.println("Thread state "+ thread.getState());
    }
}
