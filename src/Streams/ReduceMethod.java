package Streams;

import java.util.ArrayList;

public class ReduceMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        int totalPrice = cars.stream().reduce(0,
                (subtotal,car) -> subtotal + car.getPrice(),Integer::sum);
        System.out.println(totalPrice);

    }
}
