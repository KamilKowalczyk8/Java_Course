package Collections;
import java.util.ArrayList;
public class ArrayListBasic_Challenge {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ola");
        list.add("Kasia");
        list.add("Daniel");
        list.get(0);
        System.out.println(list.get(0));
        list.set(2,"Olek");
        list.add(1,"Karol");
        list.remove(0);
        System.out.println("\nnew line");
        for(String e: list){
            System.out.println(e);
        }
    }
}
