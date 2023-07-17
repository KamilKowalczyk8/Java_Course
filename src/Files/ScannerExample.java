package Files;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadz liczby ");
        int numNumbers = in.nextInt();
        int sum = 0;
        for (int i = 0; i < numNumbers; i++) {
            System.out.println("Wprowdz kolejna liczne ");
            sum+= in.nextInt();
        }
        System.out.println("Suma liczb "+sum);
    }
}
