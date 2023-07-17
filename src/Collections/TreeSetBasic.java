package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasic {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(6);
        treeSet.add(24);
        treeSet.add(89);

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Integer> decedndingIterator = treeSet.descendingIterator();
        while(decedndingIterator.hasNext()){
            System.out.println(decedndingIterator.next());
        }
    }
}
