package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinMethods {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        Car carHighestPrice= cars.stream()
                .max((car1,car2)-> car1.price > car2.price ? 1:-1)
                .get();
        System.out.println(carHighestPrice);

        Car carLowestPrice= cars.stream()
                .min((car1,car2)-> car1.price > car2.price ? 1:-1)
                .get();
        System.out.println(carLowestPrice);

        Car carLowestRating= cars.stream()
                .min((car1,car2)-> car1.raiting> car2.raiting ? 1:-1)
                .get();
        System.out.println(carLowestRating);
    }
}
