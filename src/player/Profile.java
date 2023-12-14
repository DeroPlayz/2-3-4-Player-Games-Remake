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
        return name + "- Currently " + currentColor;
    }
}