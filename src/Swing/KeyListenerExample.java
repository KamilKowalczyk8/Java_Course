package Swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class KeyListenerExample extends JFrame implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped: "+ e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed: "+ e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased: "+ e.getKeyChar());
    }

    public static void main(String[] args) {
        KeyListenerExample frame = new KeyListenerExample();

        frame.addKeyListener(frame);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
