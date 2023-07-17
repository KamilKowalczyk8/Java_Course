package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBarExample extends JFrame{
    public static void main(String[] args) {
        JToolBarExample frame = new JToolBarExample();

       JToolBar toolBar = new JToolBar();
       JButton b1 = new JButton("Click me");
       toolBar.add(b1);

       JToggleButton b2 = new JToggleButton("Click me to");
       toolBar.add(b2);

       frame.add(toolBar);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
