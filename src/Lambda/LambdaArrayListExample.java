package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
public class LambdaArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Adam");
        arr.add("Kasia");
        arr.add("ponitac");
        arr.add(null);
        arr.removeIf(e->e == null || e.equalsIgnoreCase("ponitac"));
        System.out.println(arr);
    }
}

