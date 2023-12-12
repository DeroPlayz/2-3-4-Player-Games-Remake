package Game;
import javax.swing.JFrame;

import player.Player;
import player.Profile;

import java.awt.Color;
import java.awt.color.ProfileDataException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable{
    public static Player[] players = new Player[4];
        
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

    public static void loadProfile(int slot, Profile p){
        if(slot > 4){slot = 4;}
        if(slot < 1){slot = 1;}
        slot -= 1;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(Save)){
            p.setName((String) in.readObject());
            player.setLast((String) in.readObject());
            player.setName(player.getFirst() + " " + player.getLast());
            player.setInventory((Item[]) in.readObject());
            player.setCash((double) in.readObject());
            log.setText("<html>Save loaded.<br>" + player.toString());
        } catch (IOException | ClassNotFoundException e) {
            MafLib.askString("<html>Error. Corrupted/non-existent save. Initializing new save.<br>What is your name?<br>Note: Separate first and last name with a space. (\" \")");
            player = new Player(MafLib.response.getText());
        }
        players[slot] 
    }
    // static JFrame frame = new JFrame("2 3 4 Player Games");
    
    public static void main(String[] args) {
        Profile mat = new Profile("Matthew");
        saveProfile(mat);
        // frame.setVisible(true);
        // frame.setAutoRequestFocus(true);
        // frame.setSize(1000, 600);
        
    }
}