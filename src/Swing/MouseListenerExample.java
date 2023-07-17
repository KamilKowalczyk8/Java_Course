package Swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerExample extends JFrame implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
        System.out.println("Clicked count: "+e.getClickCount());
        System.out.println("Window x: "+ e.getXOnScreen());
        System.out.println("Window Y: "+ e.getYOnScreen());

        String str = "Button clicked: ";
        switch (e.getButton()){
            case MouseEvent.BUTTON1:
                str+=" button1 ";
                break;
            case MouseEvent.BUTTON2:
                str+=" button2 ";
                break;
            case MouseEvent.BUTTON3:
                str+=" button3 ";
                break;
        }
        System.out.println("Button number: "+ e.getButton());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse press");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exit");
    }

    public static void main(String[] args) {
        MouseListenerExample frame = new MouseListenerExample();

        frame.addMouseListener(frame);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse drag. ");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                /*System.out.println("Mouse moved "
                +"X: "+ e.getX()+" Y: "+e.getY()
                );*/
            }
        });

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
