 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Collision
{
     /** 
         * pushes player and enemy away from wall when is touching.
         * TA
        */
    public void act() 
    {
       Actor player = getOneTouchedObject(Player.class);
        if(player != null){
            int dx=-player.getX()+getX();
            int dy=-player.getY()+getY();
            double rotation = Math.atan2(dy, dx);
            int newRotation = (int)Math.round(Math.toDegrees(rotation));
            getWorld().setCameraDirection(newRotation);
            getWorld().moveCamera(-10);
                 
                }
                Actor enemy = getOneTouchedObject(Enemy.class);
        if(enemy != null){
            int dx=-enemy.getX()+getX();
            int dy=-enemy.getY()+getY();
            double rotation = Math.atan2(dy, dx);
            int newRotation = (int)Math.round(Math.toDegrees(rotation));
            enemy.setRotation(newRotation);
            enemy.move(-10);
                 
                }
    }    
}
