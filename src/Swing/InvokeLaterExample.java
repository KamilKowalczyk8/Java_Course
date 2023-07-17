package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ProgresElement implements Runnable{
    private JProgressBar progressBar;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=10) {
            try {
                Thread.sleep(250);
                updateProgress(i);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void updateProgress(int progressNumber){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                progressBar.setValue(progressNumber);
            }
        });
    }
    public JProgressBar getProgressBar() {
        return progressBar;
    }
    public ProgresElement(){
        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);

    }
}

public class InvokeLaterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ProgresElement progresElement = new ProgresElement();
        frame.add(progresElement.getProgressBar());

        Thread t = new Thread(progresElement);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
