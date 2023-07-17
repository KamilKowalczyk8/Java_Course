package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarExample extends JFrame{
    public static void main(String[] args) {
        JProgressBarExample frame = new JProgressBarExample();

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMaximum(100);
        progressBar.setMinimum(0);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i+=20) {
                        Thread.sleep(200);
                        progressBar.setValue(i);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        frame.add(progressBar);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
