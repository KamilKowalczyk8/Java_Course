package thread;

public class RaceConditionExample {
    public int counter = 0;
    public void increment(){
        synchronized(this) {
            this.counter++;
        }
    }
    public static void main(String[] args)
            throws InterruptedException{
        RaceConditionExample example = new RaceConditionExample();

        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<200000; i++){
                        example.increment();
                    }
                }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<200000; i++){
                    example.increment();
                }
            }
        });
        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println("Counter "+ example.counter);

    }
}
