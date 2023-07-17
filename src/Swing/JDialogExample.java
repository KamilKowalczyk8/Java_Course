package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame{
    public static void main(String[] args) {
        JDialogExample frame = new JDialogExample();

        JDialog dialog = new JDialog(frame,"Dialog frame",true);
        dialog.setLayout(new FlowLayout());
        JButton b1 = new JButton("Close dialog");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        dialog.add(b1);
        dialog.setSize(300,400);


        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        dialog.setVisible(true);
    }
}
