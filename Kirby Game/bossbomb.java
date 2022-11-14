import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bossbomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bossbomb extends Actor
{
    /**
     * Act - do whatever the bossbomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. After a countdown, this object explodes, killing kirby if in range.
     */
    public int countdown=100;
    public void act() 
    {
       countdown--;
       if(countdown==0){//if counter =0, explode
        explode();}
        if(countdown==-50){// after a bit after explosion, remove self.
        getWorld().removeObject(this);}
    }   
    public void explode(){
        setImage("explosion.png");//set image to explosion
        getImage().scale(300,300);
        List kirbies =getObjectsInRange(150,kirbies.class);
        if(kirbies.size()>0){//kill kirby if in range
            variablecontainer.lives=0;   
        }
        
    }
}
