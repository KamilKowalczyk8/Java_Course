package Swing;

import javax.swing.*;

public class JOptionpaneShowInputDialog {
    public static void main(String[] args) {

        /*String result = JOptionPane.showInputDialog(null,
                "Wpisz swojje imie: "
                );*/
        String cars[] = {"Ford","Merc","Dodge"};
        String result2 = (String) JOptionPane.showInputDialog(
                null,
                null,
                "Wybierz auto",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]
        );
        System.out.println(result2);
        //System.out.println("Imie: "+result);

    }
}
