package Swing;

import javax.swing.*;

public class JOptionPaneShowOptionDialog {
    public static void main(String[] args) {
        String options[] = {"Save","Load latest","Compile","Abort"};

        int result = JOptionPane.showOptionDialog(
                null,
                "What to do ",
                "Project 0001",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println("wybrano "+options[result]);


        JTextArea area = new JTextArea(8,16);
        JTextField email = new JTextField(10);
        Object options1[]={
                new JLabel("Email"),
                email,
        "Send",
        "Cancel"
        };


        int result1 = JOptionPane.showOptionDialog(
                null,
                area,
                "Project 0002",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options1,
                options1[3]
        );
        System.out.println("2: "+ area.getText());
        System.out.println("email "+ email.getText());
        System.out.println("result 2 "+result1);


    }
}
