import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class swordenemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class swordenemies extends enemies
{   
    private GreenfootImage swing1=new GreenfootImage("swing1.png");//images used in animation
    private GreenfootImage swing2= new GreenfootImage("swing2.png");
    private GreenfootImage swing3= new GreenfootImage("swing3.png");
    private GreenfootImage walk1= new GreenfootImage("swordenemy1.png");
    private GreenfootImage walk2= new GreenfootImage("swordenemy2.png");
    private GreenfootImage walk3= new GreenfootImage("swordenemy3.png");

    /**
     * Act - do whatever the swordenemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This can be swallowed and pressed s to become sword kirby
     */

    public void act() 
    {
        move(-2);  
        if(variablecontainer.counter%20==0){
            walk();}//walk animation
        checkIntersecting();//check intersecting with edge or kirby
    }

    public void attack(){
        List kirbys = getObjectsInRange(150,kirby.class);
        if(kirbys.size()>0){//if kirby in range 150 when swing sword
            variablecontainer.lives--;

        } 
    }

    public void walk(){
        if (getImage() == walk1)
        {
            setImage(walk2);
        }
        else if(getImage() == walk2)
        {
            swing();//animation ( attempted)
            attack();//get kirbies in range
        }
        else 
        {
            setImage(walk1);
        }
    }

    public void swing(){
        if (getImage() == walk2)
        {
            setImage(swing2);
        }
        if(getImage() == swing2)
        {
            setImage(swing3);
        }
    }
}
// Add your action code here.
