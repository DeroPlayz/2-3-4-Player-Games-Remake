import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.*;

class Main{
    static JFrame frame = new JFrame("Demo");
    
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setAutoRequestFocus(true);
        frame.setSize(1000, 600);
        Graphics g = frame.getGraphics();
        g.setColor(Color.RED);
        g.drawRect(100, 100, 150, 150);
    }
}