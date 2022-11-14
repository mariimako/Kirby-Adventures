import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemies extends Actor
{
    
    /**
     * Act - do whatever the enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void checkIntersecting(){
        //this is a method called in alot of the enemies, so made it here so can be clled from anywhere without having the method in that object
        if(isTouching(kirbies.class)){
            variablecontainer.lives--;
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
    }
}
