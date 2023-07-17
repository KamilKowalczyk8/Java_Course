package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JMenuBarExample extends JFrame{
    public static void main(String[] args) {
        JMenuBarExample  frame = new JMenuBarExample();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem newfile = new JMenuItem("New");
        file.add(newfile);
        JMenuItem openfile = new JMenuItem("Open");
        file.add(openfile);
        JMenuItem closefile = new JMenuItem("Close");
        file.add(closefile);


        //submenu
        JMenu latestfiles = new JMenu("latest");
        JMenuItem file1 = new JMenuItem("file 1");
        latestfiles.add(file1);
        JMenuItem file2 = new JMenuItem("file 2");
        latestfiles.add(file2);
        JMenuItem file3 = new JMenuItem("file 3");
        latestfiles.add(file3);
        file.add(latestfiles);

        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("cut");
        edit.add(cut);
        JMenuItem copy = new JMenuItem("copy");
        edit.add(copy);
        JMenuItem paste = new JMenuItem("paste");
        edit.add(paste);
        menuBar.add(edit);

        file.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        frame.setJMenuBar(menuBar);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source.equals(exit))System.exit(0);
                if(source instanceof JMenuItem) System.out.println( ((JMenuItem)source).getText() );
            }
        };

        exit.addActionListener(listener);
        newfile.addActionListener(listener);
        openfile.addActionListener(listener);
        file1.addActionListener(listener);
        file2.addActionListener(listener);
        file3.addActionListener(listener);
        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
