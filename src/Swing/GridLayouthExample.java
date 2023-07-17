package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GridLayouthExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++) {
            frame.add(new JButton(" "+ i));
        }

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
