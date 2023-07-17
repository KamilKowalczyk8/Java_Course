package Collections;

import java.util.Iterator;
import java.util.LinkedList;

class Animal{
    String animal;

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                '}';
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Animal(String animal) {
        this.animal = animal;
    }
}
public class LinkedList_Challenge {
    public static void main(String[] args) {
        LinkedList<Animal> animal = new LinkedList<>();
        String elements[]={"Dog","Cat","Tiger","Lion","Panda"};
        for(int i=0;i<20;i++){
            String randEl = elements[(int)Math.floor(Math.random() * elements.length)];
            animal.add( new Animal(randEl));
        }
        animal.removeFirst();
        animal.removeLast();
        animal.addFirst(new Animal("Tiger"));
        animal.addLast(new Animal("Lion"));

        Iterator<Animal> iterr = animal.iterator();
        while (iterr.hasNext()){
            System.out.println(iterr.next());
        }

    }
}
