import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.*;

class Main{
    public static final Color Red = new Color(255, 0, 0);
    public static final Color Orange = new Color(247, 120, 5);
    public static final Color Yellow= new Color(247, 222, 5);
    public static final Color LimeGreen = new Color(0, 255, 0);
    public static final Color ForestGreen = new Color(0, 115, 4);
    
    public static final Color Cyan = new Color(5, 183, 247);
    public static final Color DarkBlue = new Color(0, 0, 255);
    public static final Color Purple = new Color(128, 0, 128);
    //I like public static final Color Lavender = new Color(128, 0, 255, 128);
    
    public static final Color Pink = new Color(247, 5, 188);
    
    static JFrame frame = new JFrame("2 3 4 Player Games");
    
    public static void main(String[] args) {
        frame.setVisible(true);
        frame.setAutoRequestFocus(true);
        frame.setSize(1000, 600);
        
    }
}