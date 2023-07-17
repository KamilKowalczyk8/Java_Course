package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");
        String strEl= (String)basicList.get(0);
        // System.out.println(strEl);
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Adam");
        arrStr.add("Anna");
        arrStr.remove(1);
        arrStr.add("Olek");


        arrStr.set(1,"Katarzyna");
        arrStr.add(0,"Zuzia");
        for(String s: arrStr){
            System.out.println(s);
        }

        System.out.println("\n affter sorting");
        Collections.sort(arrStr);
        for(String s: arrStr){
            System.out.println(s);
        }
        System.out.println("\n affter remowing");
        arrStr.remove(0);
        for(String s: arrStr){
            System.out.println(s);
        }

    }


}
