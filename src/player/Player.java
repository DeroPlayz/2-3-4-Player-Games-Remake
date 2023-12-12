package player;

import java.awt.Color;
import java.io.Serializable;

public class Player implements Serializable{
    private int num; public void setNum(int num){this.num = num;} public int getNum(){return num;}
    private Color color; public void setColor(Color color){this.color = color;} public Color getColor(){return color;}

    
}