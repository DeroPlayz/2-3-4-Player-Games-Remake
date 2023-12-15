package player;

import java.awt.Color;
import java.io.Serializable;
import static Game.Main.*;

public class Profile implements Serializable{
    public static Profile[] profiles = new Profile[10];
    private static int counter = 0;
    private String name = ""; public void setName(String name){this.name = name;} public String getName(){return name;}
    private Color currentColor = Red; public void setCurrentColor(Color color){currentColor = color;} public Color getCurrentColor(){return currentColor;}
    private int slot; public void setSlot(int slot){this.slot = slot;} public int getSlot(){return slot;}
     
    /**
     * Used for making new profiles.
     * @param Name - The name of the profile.
     */
    public Profile(String name){
        this.name = name;
        if(counter >= 10){
            System.out.println("Oops. Out of room.");    
        }
        profiles[counter] = this;
        counter++;
    }

    /**
     * Used to load from save.
     */
    public Profile(){
        
    }

    public String toString(){
        String col = "";
        if(currentColor == Red){col = "Red";}
        if(currentColor == Orange){col = "Orange";}
        if(currentColor == Yellow){col = "Yellow";}
        if(currentColor == LimeGreen){col = "LimeGreen";}
        if(currentColor == ForestGreen){col = "ForestGreen";}
        if(currentColor == Cyan){col = "Cyan";}
        if(currentColor == DarkBlue){col = "DarkBlue";}
        if(currentColor == Lavender){col = "Lavender";}
        if(currentColor == Purple){col = "Purple";}
        if(currentColor == HotPink){col = "HotPink";}
        if(currentColor == White){col = "White";}
        if(currentColor == Black){col = "Black";}
        if(currentColor == Grey){col = "Grey";}
        return name + " - Currently " + col;
    }
}