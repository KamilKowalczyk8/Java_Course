package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetMethod {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        Set<Car> set = cars.stream().filter(car -> car.price<100000)
                .collect(Collectors.toSet());

        set.forEach(car -> System.out.println(car));
    }
}
