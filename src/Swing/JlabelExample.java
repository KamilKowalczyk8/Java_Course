package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JlabelExample extends JFrame{
    public static void main(String[] args) {
        JlabelExample  frame = new JlabelExample();

        JLabel label1 = new JLabel("teksy");
        label1.setText("<html><u>nowy tekst</u></html>");
        label1.setBounds(10,10,80,50);
        label1.setForeground(Color.BLUE);

        label1.setOpaque(true);
        label1.setBackground(Color.YELLOW);
        label1.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.RED,3);
        label1.setBorder(border);

        frame.add(label1);

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
