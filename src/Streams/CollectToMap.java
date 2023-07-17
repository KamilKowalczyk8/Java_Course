package Streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        Map<String,Car> carMap = cars.stream()
                .collect(Collectors.toMap(car -> car.name , car->car));
        System.out.println(carMap);
        Car car1 = carMap.get("Vw");
        System.out.println(car1);

    }
}
