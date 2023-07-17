package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

//rosnąca
class AscendingCompatator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y) {
        if(x==y){
            return 0;
        }
        if(x>y){
            return 1;
        }else{
            return -1;
        }
    }
}
class DescendingCompatator implements Comparator<Integer>{
    @Override
    public int compare(Integer x, Integer y) {
        if(x==y){
            return 0;
        }
        if(x<y){
            return 1;
        }else{
            return -1;
        }
    }
}
public class PriorityQueueComparatorAscending {
    public static void main(String[] args) {
        PriorityQueue<Integer> test =
                new PriorityQueue<>(new AscendingCompatator());
        test.add(99);
        test.add(56);
        test.add(88);
        test.add(22);

        while(!test.isEmpty()){
            System.out.println(test.poll());
        }
        System.out.println("\n");
        PriorityQueue<Integer> test1 =
                new PriorityQueue<>(new DescendingCompatator());
        test1.add(99);
        test1.add(56);
        test1.add(88);
        test1.add(22);

        while(!test1.isEmpty()){
            System.out.println(test1.poll());
        }
    }
}
