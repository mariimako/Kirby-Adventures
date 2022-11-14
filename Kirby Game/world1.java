import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public world1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1);
        GreenfootImage bg = new GreenfootImage("world.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject (new variablecontainer(), 1000, 700);
        variablecontainer.groundlevel=600;
        addObject (new kirby(),40,600);
        addObject (new swordenemies(),900,600);
        addObject (new neutralenemies(),1000,600);

         addObject (new bounceenemy(),1300,600);
         addObject (new neutralenemies(), 1500, 600);        
        
    }
}
