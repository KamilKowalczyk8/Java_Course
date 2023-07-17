package Streams;

import java.util.ArrayList;

public class StreamsBasic {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Kasia");
        arrayList.add("Asia");
        arrayList.add("Paweł");
        arrayList.add("Daniel");
        arrayList.add("ZuZANNA");
        arrayList.add("Zenon");

        arrayList.stream().filter(e -> e.length() > 4 && e.length() < 7 )
                .filter(e -> e.startsWith("P") || e.startsWith("D"))
                .forEach(e -> System.out.println(e));

        System.out.println("\n");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge",250,50000,4));
        cars.add(new Car("Citroen",180,20000,3));
        cars.add(new Car("Vw",260,100000,4));
        cars.add(new Car("Opel",200,50000,2));
        cars.add(new Car("Mercedes",190,100000,1));

        cars.stream().filter(str -> str.raiting>2)
                .filter(str ->str.price>30000 && str.price<600000)
                .filter(str -> str.topSpeed>250)
                .forEach(str-> System.out.println(str));
    }
}
