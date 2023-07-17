package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldExample extends JFrame{
    public static void main(String[] args) {
    JTextFieldExample frame = new JTextFieldExample();
    JTextField t = new JTextField("tekst",10);
    t.setText("new text");
    t.setFont(new Font("Arial",Font.BOLD,16));
    t.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("action performed "+ t.getText());
        }
    });
    t.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("insertUpdate: "+ t.getText());
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("remove u "+ t.getText());
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    });
    frame.add(t);

    frame.setLayout(new FlowLayout());
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
}
