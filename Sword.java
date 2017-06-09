import greenfoot.*;
public class Sword extends ScrollActor
{
    /**
     * Shields can be picked up by both enemies and players. 
     * When picked up they add their defense value to the characters value
     * TA
     */
    private int attack;
    public Sword(int attack)
    {
        this.attack = attack;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }
}
