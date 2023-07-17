package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Arrays;

public class JColorChooserExample extends JFrame{
    public static void main(String[] args) {
        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame,"Wybierz kolor",Color.blue);
        System.out.println("wybran color "+color);
        JLabel label = new JLabel("label");
        frame.add(label);
        label.setForeground(color);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
