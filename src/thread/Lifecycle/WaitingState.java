package thread.Lifecycle;
class TestThread extends Thread{
    Thread mainThread;
    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " Started ");
        try {
            for (int i=0;i<3;i++){
                Thread.sleep(1000);
                System.out.println("Main thread state "+ mainThread.getState());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + " Finished ");
    }
}
public class WaitingState {
    public static void main(String[] args)
        throws InterruptedException{

            Thread mainThread = Thread.currentThread();

            TestThread t1 = new TestThread("Thread 1",mainThread);
            t1.start();

            t1.join();
            System.out.println("Main thread");

        }
}
