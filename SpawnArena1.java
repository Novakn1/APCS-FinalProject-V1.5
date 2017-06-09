 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Overworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnArena1 extends ScrollWorld
{
     int x = 0;
        int y = 0;
    /**
     * Constructor for objects of class Overworld.
     * 
     */
    public SpawnArena1()
    {    
       
        super(900, 900, 1, 5000, 5000);
        //addObject(new Enemy(10,5,5), 600, 600);
    
        //addObject(new TeleportArena4(), 400,400);
        //origin left block
        addObject(new Wall(), 200, 200);
        
        //top wall spawn room
        x=200;
         for(int i =0; i<7; i++){
          x+= 50;
          addObject(new Wall(),x , 200);
        }
        //left wall spawn room
        y=200;
         for(int i =0; i<6; i++){
          y+= 50;
          addObject(new Wall(), 200 , y);
        }
        //right wall spawn room
        y=200;
         for(int i =0; i<6; i++){
          y+= 50;
          addObject(new Wall(),550 ,y );
        }
        
        //spawn left corner
        x=150;
         for(int i =0; i<2; i++){
          x+= 50;
          addObject(new Wall(),x , 550);
        }
        
        //spawn right corner
        x=450;
         for(int i =0; i<2; i++){
          x+= 50;
          addObject(new Wall(),x , 550);
        }
        
        
        //END SPAWN ROOM//
        //BEGIN SPAWN>ARENA1 HALL//
        
        
        //spawn>first arena hall left wall
        y=550;
         for(int i =0; i<15; i++){
          y+= 50;
          addObject(new Wall(),250 , y);
        }
        
        //spawn>first arena hall right wall
        y=550;
         for(int i =0; i<10; i++){
          y+= 50;
          addObject(new Wall(),500 , y);
        }
        
        //spawn>first arena hall bottom wall
        x=250;
         for(int i =0; i<11; i++){
          x+= 50;
          addObject(new Wall(),x , 1300);
        }
        
        //spawn>first arena hall top wall
        x=500;
         for(int i =0; i<6; i++){
          x+= 50;
          addObject(new Wall(), x , 1050);
        }
        
        
        // END SPAWN>ARENA1 HALL//
        //BEGIN ARENA1//
        
        
        //Left Wall Below enterancew
        y=1300;
         for(int i =0; i<9; i++){
          y+= 50;
          addObject(new Wall(), 800 , y);
        }
        
         //Left wall above enterance
        y=1050;
         for(int i =0; i<9; i++){
          y-= 50;
          addObject(new Wall(), 800 , y);
        }
        //Top wall
         x=800;
         for(int i =0; i<20; i++){
          x+= 50;
          addObject(new Wall(), x , 600);
        }
        //System.out.println(x);
        
        //right wall 
        
         y=600;
         for(int i =0; i<24; i++){
          y+= 50;
          addObject(new Wall(), 1800 , y);
        }
        
        
        //bottom wall
        x=750;
         for(int i =0; i<20; i++){
          x+= 50;
          addObject(new Wall(), x , 1800);
        }
        
        
        //Begin Enemy Spawns//
        
         y=800;
         for(int i =0; i<11; i++){
          y+= 50;
          addObject(new Enemy(1,1,1), 1300, y );
        }
        //System.out.println(x);
        
        /*
        // Teleport Barrier top//
        x=1350;
         for(int i =0; i<4; i++){
          x+= 50;
          addObject(new Wall(), x , 1050);
        }
        //System.out.println(x);
        
         // Teleport Barrier bottom//
        x=1350;
         for(int i =0; i<4; i++){
          x+= 50;
          addObject(new Wall(), x , 1250);
        }
        //System.out.println(x);
        
        //Teleport Barrier Left//
        y=1000;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Wall(), 1350 , y);
        }
        //System.out.println(y);
        
        //Teleport Barrier Right//
        y=1000;
         for(int i =0; i<5; i++){
          y+= 50;
          addObject(new Wall(), 1550 , y);
        }
        //System.out.println(y);
        */
        //Teleporter
       // addObject(new TeleportArena2(), 1700, 1700);
        
        //END ARENA OBJECTS//
        
        
        
  
            }
            public void act(){
                if(getObjects(Enemy.class).size()==0){
                    ScrollWorld arena2 = new Arena2();
                    arena2.addCameraFollower(new Player(), 0, -150);
                    Greenfoot.setWorld(arena2);
                }
            }
        }

