package player;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import static Game.Main.*;

public class Profile implements Serializable{
    public static Profile[] profiles = new Profile[10];
    private static int counter = 0;
    private String name = ""; public void setName(String name){this.name = name;} public String getName(){return name;}
    private Color currentColor = Red; public void setCurrentColor(Color color){currentColor = color;} public Color getCurrentColor(){return currentColor;}
    private int slot; public void setSlot(int slot){this.slot = slot;} public int getSlot(){return slot;}
    
    private HashMap<Color, Boolean> colorInventory = new HashMap<Color, Boolean>(){{
            put(Red, true);
            put(Orange, false);
            put(Yellow, false);
            put(LimeGreen, true);
            put(ForestGreen, false);
            put(Cyan, false);
            put(DarkBlue, true);
            put(Lavender, false);
            put(Purple, false);
            put(HotPink, false);
            put(White, false);
            put(Black, false);
            put(Grey, false); 
    }}; 
    public void setColorInventory(HashMap<Color, Boolean> colorInventory){this.colorInventory = colorInventory;}
    public HashMap<Color, Boolean> getColorInventory(){return colorInventory;}
    
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
}