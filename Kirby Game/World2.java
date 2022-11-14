import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    
        super(1400, 800, 1);
        GreenfootImage bg = new GreenfootImage("waterbackground.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        variablecontainer.groundlevel=500;
        addObject (new variablecontainer(), 1000, 1000);
        addObject (new flyenemy(),1300,100);
        addObject (new kirby(),40,500);
        addObject (new neutralenemies(), 300,500);
        addObject (new throwenemy(),800,500);
        addObject (new bomber(), 1200, 400);
        
    }
}
