import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackhole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blackhole extends Actor
{
    /**
     * Act - do whatever the blackhole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This object is another attack the boss can do, After counter=0, it creates
     * a pillar which the kirbies' lose a life
     */
    public int counter=100;
    public void act() 
    {
        counter--;
        // Add your action code here.
        if(counter==0){// if counter=0, create pillar
            getWorld().addObject(new pillar(),getX(),getY());
            getWorld().removeObject(this);
        }
    }    
}
