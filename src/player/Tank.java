package player;

public class Tank {
    /*
     * Classic Controls - Tank constantly turns and 1 button is used to shoot and move.
     * New Controls - Use Actions 1-4 to navigate and Action 5 to shoot.
     * But which should I prioritize?
     * I guess I'll go with classic.
     */

     private int ammo = 5;
     public void autoRefill(){
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(ammo < 5){
            ammo++;
        }
    }
}
