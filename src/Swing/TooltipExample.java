package Swing;

import javax.swing.*;
import java.awt.*;

public class TooltipExample extends JFrame{
    public static void main(String[] args) {
        TooltipExample frame = new TooltipExample();

        JButton b1 = new JButton("Click me");
        b1.setToolTipText("kLIKNIJ MNIE");

        Image icon = (new ImageIcon("files\\city.jpg")).getImage();
        frame.setIconImage(icon);


        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
