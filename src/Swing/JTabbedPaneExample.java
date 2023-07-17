package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JTabbedPaneExample extends JFrame{
    public static void main(String[] args) {
        JTabbedPaneExample frame = new JTabbedPaneExample();

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = new JPanel();
        p1.add(new JTextArea(20,30));
        tabbedPane.add("First",p1);

        JPanel p2 = new JPanel();
        p2.add(new JLabel("Label"));
        tabbedPane.add("Second",p2);

        JPanel p3 = new JPanel();
        p3.add(new JButton("click"));
        tabbedPane.add("Third",p3);

        frame.add(tabbedPane);
        tabbedPane.setSelectedIndex(1);
        System.out.println("selected index: "+tabbedPane.getSelectedIndex());

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JTabbedPane pane = (JTabbedPane) e.getSource();
                System.out.println("Clicked "+ pane.getTitleAt(pane.getSelectedIndex()));
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
