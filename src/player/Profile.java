package player;

import java.awt.Color;
import java.io.LineNumberInputStream;
import java.io.Serializable;
import java.util.HashMap;
import static Game.Main.*;

public class Profile implements Serializable{
    private String name = ""; public void setName(String name){this.name = name;} public String getName(){return name;}
    private Color currentColor = Red; public void setCurrentColor(Color color){currentColor = color;} public Color getCurrentColor(){return currentColor;}
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
    }

    /**
     * Used to initialize a "dummy" (mostly to have something for save data to be loaded into.)
     */
    public Profile(){}
}