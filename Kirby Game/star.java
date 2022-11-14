import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star extends Actor
{
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.This is created when kirby spits out swallowed objects
     */
    public void act() 
    {
        move(15);//move to the right
        checkIntersecting();// Add your action code here.
    } 
    public void checkIntersecting(){
        if(isTouching(boss.class)){
            boss.hp--;//if boss, do not remove but -1 hp
            getWorld().removeObject(this);
        }
        else if(isTouching(enemies.class)){//if touching enemies, remove that enemy
            Actor enemy=(Actor) getOneIntersectingObject(enemies.class);
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);}
        else {//if 500 units away, dissapear
            List kirby=getObjectsInRange(700,kirby.class);
            Actor kirb =(Actor)kirby.get(0);
            int xPos=getX();
            int kirbyXPos=kirb.getX();
            if((xPos-kirbyXPos)>500){
                getWorld().removeObject(this);
            }
        }
        
    }
}

