import greenfoot.*;
public class Shield extends ScrollActor
{
    /**
     * Swords can be picked up by both enemies and players. 
     * When picked up they add their attack value to the characters value
     * TA
     */
    private int defense;
    public Shield(int defense)
    {
        this.defense=defense;
    }
    
    public int getDefense(){
        return defense;
    }
    public void setDefense(int defense){
        this.defense=defense;
    }
}
