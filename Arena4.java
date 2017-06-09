import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena4 extends ScrollWorld
{
    int x = 0;
    int y = 0;
    /**
     * Constructor for objects of class Arena4.
     * 
     */
    public Arena4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, 5000, 5000);
        setCameraLocation(1400,-200);
         addObject(new Wall(), 1200, 200);
     //    addObject( new TeleportEND(), 1400, 1650);
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
        
        
       //end outer area//
       
       //begin right inner block
       
       //right wall down
       y= 1150;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Wall(),1950 , y);
        }
        
        //bottom wall left
        x=1950;
        for(int i =0; i<8; i++){
            x-=50;
          addObject(new Wall(),x , 1400);
        }
        
        //left wall up
        y= 1400;
         for(int i =0; i<4; i++){
          y-= 50;
          addObject(new Wall(),1550 , y);
        }
        
        //top wall right
        x=1500;
         for(int i =0; i<9; i++){
          x+=50;
          addObject(new Wall(),x , 1150);
        }
       //end right inner block
       
      //begin left inner block
      
      //right wall down
       y= 1150;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Wall(),1200 , y);
        }
        
        //bottom wall left
        x=1200;
        for(int i =0; i<8; i++){
            x-=50;
          addObject(new Wall(),x , 1400);
        }
        
        //left wall up
        y= 1400;
         for(int i =0; i<4; i++){
          y-= 50;
          addObject(new Wall(),800 , y);
        }
        
        
        //top wall right
        x=750;
         for(int i =0; i<9; i++){
          x+=50;
          addObject(new Wall(),x , 1150);
        }
        
        //begin enemy spawns
        
          x=800;
         for(int i =0; i<20; i++){
          x+= 50;
          addObject(new Enemy(1,1,1), x, 1600 );
        }
        
        x=800;
         for(int i =0; i<20; i++){
          x+= 50;
          addObject(new Enemy(1,1,1), x, 1100 );
        }
    }
     public void act(){
                if(getObjects(Enemy.class).size()==0){
                    ScrollWorld boss = new BossArena();
                    boss.addCameraFollower(new Player(), 0, -150);
                    Greenfoot.setWorld(boss);
                }
            }
}
