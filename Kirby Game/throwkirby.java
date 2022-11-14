import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class swordkirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class throwkirby extends kirbies
{
    /**
     * Act - do whatever the swordkirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int ySpeed=0;
    public static int xPos;
    public static boolean thrown=false;
    public void act() 
    {
        xPos=getX();
        jump();move();
        checkLives();
        if(isAtEdge()){
            movetonextworld();
        }
        if(thrown==false&&Greenfoot.isKeyDown("space")){
            thrown=true;
            throwobject();
        }
        showtext();
        
    }
    public void move(){
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+5, getY());
            setImage("throwkirbyrun.png");
        }
        else if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-5, getY());
            setImage("throwkirbyrun.png");
        }
        else{
        setImage("throwkirby.png");
        }
    }   
    public void throwobject(){//make boomerang
            setImage("throwing.png");
            getWorld().addObject(new kirbyobject(), getX()+100,getY());
    }
}
