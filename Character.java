 

import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Character extends Collision
{
    private int health;
    private int attack;
    private int defense;
    public int elims;
    /*private ArrayList<Item> inventory;
    private ArrayList<Sword> wpEquipment;
    private ArrayList<Shield> arEquipment;
    private Sword sword;
    private Shield shield;*/
    public Character() 
    {
        health = 100;
        attack = 10;
        defense = 10;
        //wpEquipment.add(new Sword());
        //arEquipment.add(new Shield());
        //sword = wpEquipment.get(0);
        //shield = arEquipment.get(0);
    }
    public Character(int health, int attack, int defense){
        this.health=health;
        this.attack=attack;
        this.defense=defense;
    }
    
    /**
     * if the character passes over a potion shield or sword it will 
     * add the value of the item to its powers
     * TA,KB
     */public void foundItem(){
        
        List<Sword> sword = getObjectsAtOffset(0, 0, Sword.class);
        List<Shield> shield= getObjectsAtOffset(0,0, Shield.class);
        List<Potion> potion = getObjectsAtOffset(0,0, Potion.class);
        if(potion.size()>0) {
            //Item item = new Potion();
            health += potion.get(0).getHealth();
            defense += potion.get(0).getDefense();
            attack += potion.get(0).getAttack();
            getWorld().removeObject(potion.get(0));
        }
        if(shield.size()>0){
            //Shield item = new Shield();
            defense += shield.get(0).getDefense();
            getWorld().removeObject(shield.get(0));
        }
        if(sword.size()>0){
            //Sword item = new Sword();
            attack += sword.get(0).getAttack();
            getWorld().removeObject(sword.get(0));
        }
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int value){
        health=value;
    }
    public int getDefense(){
        return defense;
    }
    public void setDefense(int value){
        defense = value;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int value){
        attack = value;
    }
    
    /*
     * old ideas that were scraped
     * public int CalcTotDefense(){
        return((shield.getDefense()+inventoryDefense())*defense);
    }
    public int inventoryDefense(){
        int total=0;
        for (Item element: inventory){
            total+=element.getDefense();
        }
        return total;
    }
     public int CalcTotAttack(){
        return((shield.getAttack()+inventoryAttack())*attack);
    }
    public int inventoryAttack(){
        int total=0;
        for (Item element: inventory){
            total+=element.getAttack();
        }
        return total;
    }*/
}
