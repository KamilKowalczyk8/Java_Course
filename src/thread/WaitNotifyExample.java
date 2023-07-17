package thread;

import java.util.LinkedList;

class House{
    public LinkedList<String> delivery = new LinkedList<>();

    public void waitForDeliverty(){
        synchronized (delivery){
            System.out.println("Waiting for Delivery");
            while(delivery.isEmpty()){
                try {
                    delivery.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Pizza Recived "+ delivery.poll());
        }
    }
    public void pizzaGuy(){
        synchronized (delivery){
            System.out.println("Pizza delivery");
            delivery.add("Pizza");
            delivery.notify();
        }



    }
}
public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException{
        House house = new House();
            Thread customer = new Thread(new Runnable() {
                @Override
                public void run() {
                    house.waitForDeliverty();
                }
            });
        customer.start();
        Thread.sleep(3000);

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.pizzaGuy();
            }
        });
        producer.start();
    }

}
