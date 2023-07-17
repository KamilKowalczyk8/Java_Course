package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

class TestJComponent extends JComponent{
    Image img;
    public TestJComponent(){
        super();
        img = new ImageIcon("las.jpg").getImage();
    }


    public void paintComponent(Graphics g){
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial",Font.ITALIC,16));
        g.drawString("Tekst",10,10);
        g.setColor(Color.lightGray);
        g.fillRect(30,50,100,20);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(img,100,100,100,80,this);

        g2d.setColor(Color.RED);
        g2d.draw(new Line2D.Float(0.0f,10.0f,220.0f,200.5f));
        g2d.draw(new Rectangle2D.Float(10.0f,20.0f,50.0f,100.0f) );
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(new Ellipse2D.Float(30.0f,50.0f,80.0f,50.0f));
    }
}
public class JComponentExample extends JFrame {
    public static void main(String[] args) {
        JComponentExample frame = new JComponentExample();

        TestJComponent component = new TestJComponent();
        frame.add(component);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
