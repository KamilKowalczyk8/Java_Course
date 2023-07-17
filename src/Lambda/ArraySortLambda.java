package Lambda;

import java.util.Arrays;

public class ArraySortLambda {
    public static void main(String[] args) {
        String arrStr[] = {"Ford","Bmw","Mercedes","DoDGE"};
        Arrays.sort(arrStr,(a,b)->{return  a.length() - b.length();});
        for (String s:arrStr) {
            System.out.println(s);
        }
    }
}
