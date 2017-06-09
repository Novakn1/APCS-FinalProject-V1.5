 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena2 extends ScrollWorld
{
    int x = 0;
    int y = 0;
    /**
     * Constructor for objects of class Arena2.
     * 
     */
    public Arena2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, 5000, 5000);
        setCameraLocation(1400,-200);
       //   addObject(new TeleportArena3(), 1450, 2450);
       // Player.setGlobalLocation(1000, 0);
        //origin left block
        addObject(new Wall(), 1200, 200);
        
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
         for(int i =0; i<10; i++){
          y+= 50;
          addObject(new Wall(),1250 , y);
        }
        
        //arena hall right wall
        y=550;
         for(int i =0; i<10; i++){
          y+= 50;
          addObject(new Wall(),1500 , y);
        }
        
        //end arena hall
        
        //begin arena2
        
        //left from left hall wall
        x=1250;
         for(int i =0; i<5; i++){
          x-=50;
          addObject(new Wall(),x , 1050);
        }
        
        //down from /\ 
        y=1050;
         for(int i =0; i<8; i++){
          y+= 50;
          addObject(new Wall(),1000 , y);
        }
        
        //left from /\
        x=1000;
         for(int i =0; i<8; i++){
          x-=50;
          addObject(new Wall(),x , 1450);
        }
        
        //down from /\ 
        y=1450;
         for(int i =0; i<14; i++){
          y+= 50;
          addObject(new Wall(),600 , y);
        }
        
        //Right from /\
        x=600;
         for(int i =0; i<8; i++){
          x+=50;
          addObject(new Wall(),x , 2150);
        }
        
        //down from /\ 
        y=2150;
         for(int i =0; i<8; i++){
          y+= 50;
          addObject(new Wall(), 1000 , y);
        }
        
        //Right from /\
        x=1000;
         for(int i =0; i<15; i++){
          x+=50;
          addObject(new Wall(),x , 2550);
        }
        
        //up from /\ 
        y=2550;
         for(int i =0; i<8; i++){
          y-= 50;
          addObject(new Wall(), 1750 , y);
        }
        
        //Right from /\
        x=1750;
         for(int i =0; i<8; i++){
          x+=50;
          addObject(new Wall(),x , 2150);
        }
        
        //up from /\ 
        y=2150;
         for(int i =0; i<14; i++){
          y-= 50;
          addObject(new Wall(), 2150 , y);
        }
        
        //Left from /\
        x=2150;
         for(int i =0; i<8; i++){
          x-=50;
          addObject(new Wall(),x , 1450);
        }
        
        //up from /\ 
        y=1450;
         for(int i =0; i<8; i++){
          y-= 50;
          addObject(new Wall(), 1750 , y);
        }
        
        //Left from /\
        x=1750;
         for(int i =0; i<5; i++){
          x-=50;
          addObject(new Wall(),x , 1050);
        }
        
         ///begin spawn enemys
          x=800;
         for(int i =0; i<10; i++){
          x+= 115;
          addObject(new Enemy(1,1,1), x, 2000 );
        }
        
         x=800;
         for(int i =0; i<10; i++){
          x+= 115;
          addObject(new Enemy(1,1,1), x, 1600 );
        }
      
    }
     public void act(){
                if(getObjects(Enemy.class).size()==0){
                    ScrollWorld arena3 = new Arena3();
                    arena3.addCameraFollower(new Player(), 0, -150);
                    Greenfoot.setWorld(arena3);
                }
            }
}
