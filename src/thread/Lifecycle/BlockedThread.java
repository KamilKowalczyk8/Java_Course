package thread.Lifecycle;
class SomeThread implements Runnable{

    public static synchronized void test(){
        while(true){

        }
    }


    @Override
    public void run() {
        test();
    }
}
public class BlockedThread {
    public static void main(String[] args)
    throws InterruptedException{
        Thread thread = new Thread(new SomeThread());
        Thread thread1 = new Thread(new SomeThread());
        thread.start();
        thread1.start();
        Thread.sleep(100);
        System.out.println(thread.getState());
        System.out.println(thread1.getState());

    }
}
