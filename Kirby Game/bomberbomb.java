import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bomberbomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomberbomb extends enemies
{
    /**
     * Act - do whatever the bomberbomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.This bomb is different than the bomb the flyenemy drops, 
     * it acts like a ball, intergrating the jump method
     */
    public int ySpeed=0;//gravity
    public void act() 
    {
        move(-10);//move to the left
        fly();// Add your action code here.
        checkIntersecting();//check intersecting with kriby or edge
    } 
    public void fly(){
        boolean onBomberHand = (getX() == bomber.xPos);//if at bomber
        if (onBomberHand==false){//if not on bomber   
            ySpeed+=2; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)

        }
        else // on ground
        { if(onBomberHand==true){
                    ySpeed = -30; // add jump speed
                    setLocation(getX(), getY()+ySpeed); // leave bomber
                
            }}
    }
}
