import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pillar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pillar extends Actor
{
    /**
     * Act - do whatever the pillar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int countdown=50;//dont want to immediatly remove
    public pillar(){
        getImage().scale(100,400);//appear to be longer but not wider(hitbox does not change)
    }
    public void act() 
    {
        countdown--;
        if(isTouching(kirbies.class)){// Add your action code here.
            variablecontainer.lives--;//if touching, decrease lives
        }    
        if(countdown==0){//remove after a bit
            getWorld().removeObject(this);
        }
    }
}
