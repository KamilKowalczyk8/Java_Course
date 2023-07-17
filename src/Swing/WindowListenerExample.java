package Swing;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

public class WindowListenerExample extends JFrame
        implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window open");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Okno zamkniete");
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("zamkniete");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("zminimalizowane");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("pokazane ponowue");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("aktywne");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("nieaktywne");
    }

    public static void main(String[] args) {
            WindowListenerExample frame = new WindowListenerExample();

            frame.addWindowListener(frame);
            frame.addWindowFocusListener(new WindowFocusListener() {
                @Override
                public void windowGainedFocus(WindowEvent e) {
                    System.out.println("Window gained focus");
                }

                @Override
                public void windowLostFocus(WindowEvent e) {
                    System.out.println("winodw lost focus");
                }
            });

            frame.setSize(300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

}
