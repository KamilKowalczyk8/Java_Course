package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class AnimalHash{
    private static String name;

    @Override
    public String toString() {
        return "AnimalHash{" +
                "name='" + name + '\'' +
                '}';
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalHash(String name) {
        this.name = name;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalHash that = (AnimalHash) o;
        return this.name.equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/
}
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<AnimalHash> set = new HashSet<>();
        AnimalHash a = new AnimalHash("Tiger");
        set.add(a);
        set.add(a);
        set.add(new AnimalHash("Lion"));
        set.add(new AnimalHash("dog"));
        set.add(new AnimalHash("Tiger"));
        Iterator<AnimalHash> iterator = set.iterator();
        while(iterator.hasNext()){
            AnimalHash animal = iterator.next();
            System.out.println(animal);
        }
    }


}
