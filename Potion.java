 

import greenfoot.*;
/**
 * Write a description of class potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potion extends ScrollActor
{
    /**
     * potions can be picked up by both enemies and players. 
     * When picked up they add their values to the characters values
     * TA
     */
    private int health;
    private int attack;
    private int defense;
    
    public Potion(int heath, int attack, int defense)
    {
        this.health=health;
        this.attack=attack;
        this.defense=defense;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }
    public int getDefense(){
        return defense;
    }
    public void setDefense(int defense){
        this.defense=defense;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }
}
