package player;

public class Chicken extends Character{
    private boolean currentGravity;
    private static final boolean Normal = true;
    private static final boolean Flipped = false;

    public Chicken(String minigame, String charTemplate) {
        super(minigame, charTemplate);   
    }
    
    public void loop(){
        X++;
    }

    /*Temp*/ int UpperBound;
    /*Temp*/ int LowerBound;
    public void collision(){
        while(currentGravity == Normal){
            while(Y > UpperBound){
                Y--;
            }
        }
        while(currentGravity == Flipped){
            while(Y < LowerBound){
                Y++;
            }
        }
    }

    public void Flip(){
        if(currentGravity == Normal){
            currentGravity = Flipped;
        }
        else{
            currentGravity = Normal;
        }
    }
}
