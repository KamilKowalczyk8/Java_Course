package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarExample extends JFrame{
    public static void main(String[] args) {
        JScrollBarExample  frame = new JScrollBarExample();

       JScrollBar scrollBar = new JScrollBar(Adjustable.HORIZONTAL);
       scrollBar.setValue(20);
       scrollBar.setMinimum(0);
       scrollBar.setMaximum(100);
       //scrollBar.setPreferredSize(new Dimension(35,170));
        scrollBar.setPreferredSize(new Dimension(170,35));
       scrollBar.addAdjustmentListener(new AdjustmentListener() {
           @Override
           public void adjustmentValueChanged(AdjustmentEvent e) {
               if(e.getValueIsAdjusting())return;
               System.out.println("scroll value: "+e.getValue());
           }
       });

       frame.add(scrollBar);

       frame.setLayout(new FlowLayout());
       frame.setSize(300,300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
}
