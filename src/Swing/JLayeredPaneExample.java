package Swing;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneExample extends JFrame{
    public static void main(String[] args) {
        JLayeredPaneExample frame = new JLayeredPaneExample();

        JLayeredPane layeredPane = frame.getLayeredPane();
        JButton b1 = new JButton();
        b1.setBounds(10,10,50,50);
        b1.setBackground(Color.RED);
        layeredPane.add(b1,10);

        JButton b2 = new JButton();
        b1.setBounds(14,30,50,50);
        b1.setBackground(Color.BLUE);
        layeredPane.add(b2,15);

        JButton b3 = new JButton();
        b1.setBounds(30,30,50,50);
        b1.setBackground(Color.gray);
        layeredPane.add(b3,12);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
