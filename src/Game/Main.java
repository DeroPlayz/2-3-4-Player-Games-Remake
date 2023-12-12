package Game;
import javax.swing.JFrame;

import player.Profile;

import java.awt.Color;
import java.awt.color.ProfileDataException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import static player.Profile.profiles;

public class Main implements Serializable{
    static Profile One = new Profile();
    static Profile Two = new Profile();
        
    public static Profile[] players = new Profile[4];
        
    public static final Color Red = new Color(255, 0, 0);
    public static final Color Orange = new Color(247, 120, 5);
    public static final Color Yellow = new Color(247, 222, 5);
    public static final Color LimeGreen = new Color(0, 255, 0);
    public static final Color ForestGreen = new Color(0, 115, 4);
    public static final Color Cyan = new Color(5, 183, 247);
    public static final Color DarkBlue = new Color(0, 0, 255);
    public static final Color Lavender = new Color(212, 109, 212);
    public static final Color Purple = new Color(128, 0, 128);
    public static final Color HotPink = new Color(255, 0, 171);
    public static final Color White = new Color(255, 255, 255);
    public static final Color Black = new Color(0, 0, 0);
    public static final Color Grey = new Color(128, 128, 128);

    public static void save(){
        File dir = new File("src/Profiles/Profile");
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dir));
            for(int i = 0; i < 10; i++){
                if(profiles[i] != null){
                    out.writeObject(profiles[i].getName());
                }
                else{
                    out.writeObject("Blank");
                }
            }
            out.close();
        } catch (IOException e) {
            dir = new File("src/Profiles");
            dir.mkdirs();
            save();
        }

    }
    public static void saveProfile(Profile p){
        File dir = new File("src/Profiles/" + p.getName());
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dir));
            out.writeObject(p.getName());
            out.writeObject(p.getCurrentColor());
            out.writeObject(p.getColorInventory());
            out.close();
        } catch (IOException e) {
            dir = new File("src/Profiles");
            dir.mkdirs();
            saveProfile(p);
            // e.printStackTrace();
        }
    }

    public static void load(){
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("src/Profiles/Profile"));
            for(int i = 0; i < 10; i++){
                try {
                    String nam = (String) in.readObject();
                    if(!nam.equals("Blank")){
                        profiles[i].setName((String) in.readObject());
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadProfile(int slot, Profile p){
        if(slot > 4){slot = 4;}
        if(slot < 1){slot = 1;}
        p.setSlot(slot);
        slot -= 1;
        players[slot] = p;
    }
    
    static JFrame frame = new JFrame("2 3 4 Player Games");
    
    public static void main(String[] args) {
        One = new Profile("Matthew");
        Two = new Profile("Tyson");
        // save();

        load();
        
        frame.setVisible(true);
        frame.setAutoRequestFocus(true);
        frame.setSize(1000, 600);
        
    }
}