package thread;

public class DemonExample {
    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(1000);
                        System.out.println("Daemon thread: " + i);
                        i++;
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("Quit main thread");

    }
}
