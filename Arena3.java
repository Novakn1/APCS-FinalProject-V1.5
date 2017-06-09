 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena3 extends ScrollWorld
{
    int x = 0;
    int y = 0;
    /**
     * Constructor for objects of class Arena3.
     * 
     */
    public Arena3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, 5000, 5000);
          setCameraLocation(1400,-200);
       // Player.setGlobalLocation(1000, 0);
        //origin left block
        addObject(new Wall(), 1200, 200);
        //addObject(new TeleportArena4(), 1350, 1700);
        //top wall spawn room
        x=1200;
         for(int i =0; i<7; i++){
          x+= 50;
          addObject(new Wall(),x , 200);
        }
        //left wall spawn room
        y=200;
         for(int i =0; i<6; i++){
          y+= 50;
          addObject(new Wall(), 1200 , y);
        }
        //right wall spawn room
        y=200;
         for(int i =0; i<6; i++){
          y+= 50;
          addObject(new Wall(),1550 ,y );
        }
        
        //spawn left corner
        x=1150;
         for(int i =0; i<2; i++){
          x+= 50;
          addObject(new Wall(),x , 550);
        }
        
        //spawn right corner
        x=1450;
         for(int i =0; i<2; i++){
          x+= 50;
          addObject(new Wall(),x , 550);
        }
        
        //end spawn room//
        
        //begin arena hall//
        
         y=550;
         for(int i =0; i<4; i++){
          y+= 50;
          addObject(new Wall(),1250 , y);
        }
        
        //arena hall right wall
        y=550;
         for(int i =0; i<4; i++){
          y+= 50;
          addObject(new Wall(),1500 , y);
        }
        
        //end arena hall
        
       // left from left hall wall
        x=1250;
        for(int i =0; i<15; i++){
            x-=50;
          addObject(new Wall(),x , 750);
        }
        
        //down from /\
        y=750;
         for(int i =0; i<20; i++){
          y+= 50;
          addObject(new Wall(),500 , y);
        }
        //right from right hall wall
        x=1450;
         for(int i =0; i<15; i++){
          x+=50;
          addObject(new Wall(),x , 750);
        }
        
        //down from /\
        y=750;
         for(int i =0; i<20; i++){
          y+= 50;
          addObject(new Wall(),2200 , y);
        }
        
        //right from left arena wall
        x=500;
         for(int i =0; i<33; i++){
          x+=50;
          addObject(new Wall(),x , 1750);
        }
        
        //begin cross
        
        y=900;
         for(int i =0; i<13; i++){
          y+= 50;
          addObject(new Wall(), 1375 , y);
        }
        
         x=800;
        for(int i =0; i<20; i++){
            x+=50;
          addObject(new Wall(),x , 1250);
        }
        
        //begin enemy spawns
        
         y=800;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Enemy(1,1,1), 1000, y );
        }
         y=800;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Enemy(1,1,1), 1100, y );
        }
        
        y=800;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Enemy(1,1,1), 1700, y );
        }
         y=800;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Enemy(1,1,1), 1800, y );
        }
        
         x=800;
         for(int i =0; i<5; i++){
          x+= 50;
          addObject(new Enemy(1,1,1), x, 1600 );
        }
        
          x=1600;
         for(int i =0; i<5; i++){
          x+= 50;
          addObject(new Enemy(1,1,1), x, 1600 );
        }
    }
     public void act(){
                if(getObjects(Enemy.class).size()==0){
                    ScrollWorld arena4 = new Arena4();
                    arena4.addCameraFollower(new Player(), 0, -150);
                    Greenfoot.setWorld(arena4);
                }
            }
}
