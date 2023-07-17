package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Challenge {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for(int i =0;i<30;i++){
            int randInt = (int)Math.floor(Math.random()*101);
            numbers.add(randInt);

        }
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
