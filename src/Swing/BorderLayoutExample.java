package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel north = new JLabel("North",JLabel.CENTER);
        north.setBorder(border);
        frame.add(north, BorderLayout.NORTH);

        JLabel east = new JLabel("East",JLabel.CENTER);
        east.setBorder(border);
        frame.add(east, BorderLayout.EAST);

        JLabel west = new JLabel("West",JLabel.CENTER);
        west.setBorder(border);
        frame.add(west, BorderLayout.WEST);

        JLabel south = new JLabel("south",JLabel.CENTER);
        south.setBorder(border);
        frame.add(south, BorderLayout.SOUTH);



        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
