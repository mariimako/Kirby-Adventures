import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends enemies
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int fallSpeed;
    public void act() 
    {
        fall();// Add your action code here.
        checkIntersecting();//check intersecting with kirby or edge
    }   
    public void fall(){
        fallSpeed++;//fall with increasing speed (gravity)
        setLocation(getX(),getY()+fallSpeed);
    }
        
        
    }

