import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Keith here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keith extends Character
{
    /**
     * Act - do whatever the Keith wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage mad = new GreenfootImage("keith head mad.png");
      private int direction;
    private int speed;
    private int count;
    private int pause;
    private int delay;
    private int animNum;
    public Keith()
    {
        super();
    }
    public Keith(int health, int attack, int defense){
        super(health,attack,defense);
    }
        public void act() 
    {
   
   
   
    
        if (pause==0){
            getExcited(10000);
            attackPlayer(100,40);
            
    
        if(findClosestPlayer()){
            randomSpeed(2,6);
            move(speed);
        }else{
            moveRandom();
        }
        foundItem();
        if (getHealth()<0){
            getWorld().removeObject(this);
             
        }
      }else if (pause<0){
        pause=0;
      }else{
        pause--;
      }
      if (getHealth()<0){
        A a = new A();
        getWorld().addObject(a,getGlobalX(),getGlobalY());    
        getWorld().removeObject(this);
             
        }
      if (getHealth()<200 && getHealth()>0){
        setImage(mad);
             
        }
    }
    /**
     * finds the closest player and will turn towards it. returns true if one is found
     * and returns false if no players are found
     * TA
       */
    public boolean findClosestPlayer(){
        
        for (int i=1; i<600; i+=10){
            List<Player> players = getObjectsInRange(i, Player.class);
            if (players.size()>0){
                turnTowards(players.get(0).getX(),players.get(0).getY());
                return true;
            }
        }
        return false;
    }
    /**
     * will attack all players within the given range every rate number of acts. if all players leave then
     * the counter refreshes so when a new player enters it will attack imediatly.
     * The health damage done is the ratio of its attack strenght to the enemies defense  
     * It also pushed the player away when attacked and changes the players image temporaly to
     * show damage
     * TA
       */
    public void attackPlayer(int range, int rate)
    {
       List<Player> close = getObjectsInRange(range, Player.class);
       if (close.size()>0){
           if(count==0){
               for (Player player: close){
                   player.setHealth(player.getHealth()-(int)(getAttack()/player.getDefense()+1));
                   getWorld().setCameraDirection(getRotation());
                   
                   player.setImage("dmg.png");
                   setPause(50);
                   Greenfoot.delay(3);
                   player.setImage("play.png");
                   //World world= getWorld();
                   //world.removeObject(close.get(0));
                }
            }
           count++;
           if(count>=rate){
               count=0;
           }
       
       }else{
           count = 0;
       }
    }
    
    /**
     * goes throgh the attack animation for the eye when a player is within range.
     * TA,NP
     */public void getExcited(int range){
        
        GreenfootImage[] anim = {new GreenfootImage("en1_1.png"), new GreenfootImage("en1_2.png"),
        new GreenfootImage("en1_3.png"), new GreenfootImage("en1_4.png")};
        List<Player> players = getObjectsInRange(range, Player.class);
        if (players.size() >0) {
            if (delay == 0) {
                setImage(anim[animNum]);
                animNum++;
            }
            delay++;
            if (delay>=4){
                delay=0;
            }
        }else{
            setImage(anim[0]);
            delay=0;
            animNum=0;
        }
        if (animNum > 3) {
            animNum = 0;
        }
    }
    /**
     * sets the pause
     * TA
     */public void setPause(int time)
    {
        pause=time;
    }
    /**
     * will move forward at a random speed of either 0 or 1 and will rotate an random amount
     * between -5 and 5 degrees
     * TA
     */public void moveRandom()
    {
        setRotation(getRotation()+(int)(Math.random()*10-5));
        randomSpeed(0,1);
        move(speed);
    }
    /**
     * will move at random speed between the min and max value
     * TA
     */public void randomSpeed(int min,int max){
        if (speed>=max){
            speed=max-(int)(Math.random()*2);
        }else if (speed<=min){
            speed=min+(int)(Math.random()*2);
        }else{
            speed=speed+(int)(Math.random()*3)-1;
        }
    }
    }    

