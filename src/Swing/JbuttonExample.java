package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class JbuttonExample extends JFrame{
    public static void main(String[] args) {
        JbuttonExample frame = new JbuttonExample();

        JButton b1 = new JButton("Przycisk 1");
        b1.setBounds(10,10,100,50);
        b1.setText("vbUTTON1");
        b1.setFont(new Font("Arial", Font.BOLD,14));
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });

        JButton b2 = new JButton();
        b2.setBounds(10,100,100,50);
        b2.setIcon(new ImageIcon("Są.jpg"));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setEnabled(false);
                System.out.println("");
            }
        });
        frame.add(b2);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
