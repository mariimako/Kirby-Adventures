import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends enemies
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.Since this is a "enemies", kirby can swallow and spit it out.
     */
    public void act() 
    {
        move(-15);//move to the left
        checkIntersecting();//check if hitting kirby
    }   
}
