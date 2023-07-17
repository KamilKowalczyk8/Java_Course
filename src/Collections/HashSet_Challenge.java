package Collections;

import java.util.HashSet;
import java.util.Iterator;
class CarHash{
    public String name;

    @Override
    public String toString() {
        return "CarHash{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarHash(String name) {
        this.name = name;
    }
}
public class HashSet_Challenge {
    public static void main(String[] args) {
        HashSet<String> marki = new HashSet<>();
        marki.add("Ola");
        marki.add("Kasia");
        marki.add("Damiel");
        marki.add("Ola");
        marki.add("Kasia");
        marki.add("Kasia");
        marki.add("Adam");
        Iterator<String> iterator = marki.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n---------------------");
        HashSet<CarHash> car = new HashSet<>();
        car.add(new CarHash("Dodge"));
        car.add(new CarHash("Dodge"));
        car.add(new CarHash("Dodge"));
        car.add(new CarHash("Cictroen"));
        car.add(new CarHash("Opel"));
        Iterator<CarHash> iteratorr = car.iterator();
        while (iteratorr.hasNext()) {
            CarHash carr = iteratorr.next();
            System.out.println(carr);
        }
    }
}
