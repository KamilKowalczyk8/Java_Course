package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        List<Car> limitcars = cars.stream().filter(car -> car.price < 60000)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limitcars);
    }
}
