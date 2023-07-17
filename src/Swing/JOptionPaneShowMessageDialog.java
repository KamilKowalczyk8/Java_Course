package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JOptionPaneShowMessageDialog extends JFrame{
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();

        /*JOptionPane.showMessageDialog(frame,
                "Hello world",
                "Title",
                JOptionPane.PLAIN_MESSAGE);*/

        ImageIcon icon = new ImageIcon("\"C:\\Users\\48730\\Desktop\\jdd.jpg\"");
        JOptionPane.showMessageDialog(null,
        "<html><u>Hello Wortl</u></html>",
        "Tytył",
        JOptionPane.ERROR_MESSAGE,icon);



        // frame.setLayout(new FlowLayout());
        //  frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
    }
}
