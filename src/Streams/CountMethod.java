package Streams;

import java.util.ArrayList;

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        int numCars = (int) cars.stream().filter(car -> car.topSpeed>=190).count();
        System.out.println(numCars);
    }
}
