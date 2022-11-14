import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamestarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamestarter extends Actor
{
    /**
     * Act - do whatever the gamestarter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new world1()); 
            variablecontainer.lives=3;//I had to make this as I could not do "greenfoot.iskeyDown at the world1 code, so just created this
        }// Add your action code here.
    }    
}
