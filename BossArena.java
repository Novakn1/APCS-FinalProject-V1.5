import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossArena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossArena extends ScrollWorld
{

    /**
     * Constructor for objects of class BossArena.
     * 
     */
    public BossArena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(900, 900, 1, 5000, 5000);
          setCameraLocation(2500,2500);
          addObject(new Boss(500,20,20), 1000, 1000);
    }
    public void act(){
                if(getObjects(Boss.class).size()==0){
                    ScrollWorld keith = new End();
                    keith.addCameraFollower(new Player(), 0, -150);
                    Greenfoot.setWorld(keith);
                }
            }
}
