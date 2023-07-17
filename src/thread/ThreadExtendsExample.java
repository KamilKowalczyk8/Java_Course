package thread;
class TestNewThread extends Thread{
    private int sleepTime;
    public TestNewThread(String name, int sleepTime){
        super(name);
        this.sleepTime=sleepTime;
    }
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println("watek i "+ this.getName() +i);
            try{
                this.sleep(this.sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
public class ThreadExtendsExample {
    public static void main(String[] args) {
        TestNewThread thread = new TestNewThread("Thread1 ",1000);
        thread.start();
        TestNewThread thread1 = new TestNewThread("thread2 ",700);
        thread1.start();
    }
}
