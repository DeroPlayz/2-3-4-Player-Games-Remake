package Game;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import player.Profile;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import lib.MafLib;
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
                    saveProfile(profiles[i]);
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
            out.writeObject(p.getCurrentColor().getRed());
            out.writeObject(p.getCurrentColor().getGreen());
            out.writeObject(p.getCurrentColor().getBlue());
            out.close();
        } catch (IOException e) {
            dir = new File("src/Profiles");
            dir.mkdirs();
            saveProfile(p);
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
                        loadProfile(profiles[i]);
                    }
                } catch (ClassNotFoundException e) {
                    save();
                }
            }
        } catch (FileNotFoundException e) {
            save();
        } catch (IOException e) {
            save();
        }
    }
    public static void loadProfile(Profile p){
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("src/Profiles/Profile"));
            File file = new File("src/Profiles/" + p.getName());
            if(file.exists()){
                try {
                    p.setName((String) in.readObject());
                    ObjectInputStream inner = new ObjectInputStream(new FileInputStream("src/Profiles/" + p.getName()));
                    inner.readObject();
                    String r = String.valueOf(inner.readObject());
                    String g = String.valueOf(inner.readObject());
                    String b = String.valueOf(inner.readObject());
                    
                    int rr = Integer.parseInt(r);
                    int gg = Integer.parseInt(g);
                    int bb = Integer.parseInt(b);
                    p.setCurrentColor(new Color(rr, gg, bb));
                    inner.close();
                } catch (ClassNotFoundException e) {
                    // System.exit(0);
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            // System.exit(0);
            e.printStackTrace();
        } catch (IOException e) {
            // System.exit(0);
            e.printStackTrace();
        }
    }
    
    public static JFrame frame = new JFrame("2 3 4 Player Games");
    
    public static void main(String[] args) {
        save();
        load();
        save();
        JLabel title = new JLabel("FUNKY TIME");
        JButton chicken = new JButton("ChickenRun.png");

        frame.setVisible(true);
        frame.setAutoRequestFocus(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(title);
        // frame.add(chicken);

        title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        title.setBounds(MafLib.centerTextH(title), 100, frame.getWidth(), 100);

        chicken.setBounds(MafLib.centerTextH(chicken), 150, 100, 100);
        
    }
}