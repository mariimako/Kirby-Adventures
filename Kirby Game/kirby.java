import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.ArrayList;
/**
 * Write a description of class kirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kirby extends kirbies
{
    /**
     * Act - do whatever the kirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemies swallowed=null;
    public enemies enemy;
    public List enemies;
    public static int xPos;
    public int ySpeed=0;
    public GreenfootImage stateofKirby = new GreenfootImage("standkirby.png");
    public GreenfootImage kirbyswallowed = new GreenfootImage("swallowed.png");

    public void act() 
    {
        xPos=getX();
        jump();move();
        checkLives();//resets global varaibles
        if(isAtEdge()){
            //if at edge, go to next world
            movetonextworld();
        }

        showtext();//possibility of removing self when swallow, so put "swallow" action at end
        if (swallowed == null && Greenfoot.isKeyDown("space")){
            swallow();}//if not swallowed and space pressed
        if (swallowed != null && Greenfoot.isKeyDown("s")){
            copyAbility();}//if swallowed
        if (swallowed != null && Greenfoot.isKeyDown("e")){
            spitOut();}

    }


    public void move(){
        
        if(stateofKirby!=kirbyswallowed){//if swallowed, cannot move
            if(Greenfoot.isKeyDown("d")){
                setLocation(getX()+5, getY());
                setImage("download-1.png");
            }
            else if(Greenfoot.isKeyDown("a")){
                setLocation(getX()-5, getY());
                setImage("download-1.png");
            }
            else{
                setImage("standkirby.png");
            }}
        else{
            setImage(kirbyswallowed);//if swallowed keep image swallowed
        }

        
    }

    public void spitout(){//create star that can kill enemies
        getWorld().addObject(new star(),getX()+50,getY());

    }

    public void swallow(){//swallow enemy
        setImage("swallowingkirby.png");
        enemies=getObjectsInRange(150,enemies.class);
        if(enemies.size()>0){
            enemy = (enemies)enemies.get(0);
            stateofKirby=kirbyswallowed;
            setImage(kirbyswallowed);
            swallowed = enemy; 
            getWorld().removeObject(enemy);

        }

    }

    public void spitOut(){
        if(swallowed==enemy){
            spitout();
        }
        stateofKirby=new GreenfootImage("standkirby.png");
        swallowed=null;
    }

    public void copyAbility(){
        if(enemy instanceof swordenemies){//if swallow sword enemy, become sword kirby
            getWorld().addObject(new swordkirby(),getX(),getY());
            getWorld().removeObject(this);
        }
        else if(enemy instanceof throwenemy){
            getWorld().addObject(new throwkirby(),getX(),getY());
            getWorld().removeObject(this);    
        } 
        else{//else, do not do anything
        }
        stateofKirby=new GreenfootImage("standkirby.png");//state of kirby is not swallowed
        swallowed=null;

    }


} 
