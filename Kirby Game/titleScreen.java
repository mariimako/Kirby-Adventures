import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titleScreen extends World
{

    /**
     * Constructor for objects of class titleScreen.
     * 
     */
    public titleScreen()
    {    
        super(1400,800,1);// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(new gamestarter(), 700, 700);//has the if space is down go to world one
        showText("Press space to start",650,700);
        showText("      MOVE: SD JUMP:W   SWALLOW/ACTION: space    COPY ABILITY: S (while swallowed)    SPIT OUT: E (while swallowed)",600,100);
    }
}
