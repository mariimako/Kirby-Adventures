import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;

/**
 * Write a description of class world3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world3 extends World
{

    /**
     * Constructor for objects of class world3.
     * 
     */
    public world3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1);
        GreenfootImage bg = new GreenfootImage("world3.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject (new variablecontainer(), 1000, 700);
        variablecontainer.groundlevel=600; 
        addObject (new boss(),1000,600);
        addObject (new kirby(), 20, 600);

    }

}
