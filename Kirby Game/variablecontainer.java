import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class variablecontainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class variablecontainer extends Actor
{
    /**
     * Act - do whatever the variablecontainer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //I realize I could put this in one of the "class" kirbies or enemies as those don'tbecome removed, but it was later 
    //when I made that class so decided to keep it here
    public static int counter;
    public static int groundlevel=0;//represents the groundlevel where kirby should be landing when jumped and where enemies should be
    public static int lives=3;
    public variablecontainer(){//reset some variables
        counter=0;//this object contans variables. Since all other objects may be removed, I wanted to organize by making an
        //actor that only has variables that can be get by any othe robject
    }
    public void act() 
    {
        counter++;// Counter, used for reducing spamming or spawning enemies.
    }    
}
