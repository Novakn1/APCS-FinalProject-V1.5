import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends ScrollWorld
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(900, 900, 1, 10000, 10000);
       setCameraLocation(5000,5000);
       addCameraFollower(new Player(), 0, 0);
       addCameraFollower( new GardenInTheSky(),0 , -300);
       addCameraFollower( new Start(), 0, 265);
       addCameraFollower(new Help(), -350, 400);
    }
}
