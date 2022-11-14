import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class swordkirby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class swordkirby extends kirbies
{
    /**
     * Act - do whatever the swordkirby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int ySpeed=0;
    private GreenfootImage image1=new GreenfootImage("runanimation1.png");
    private GreenfootImage image2= new GreenfootImage("runanimation2.png");
    private GreenfootImage image3= new GreenfootImage("runanimation3.png");
    private GreenfootImage image4= new GreenfootImage("runanimation4.png");
    private GreenfootImage standingkirby = new GreenfootImage("swordkirby.png");

    private GreenfootImage swing3= new GreenfootImage("swordanimation3.png");


    public swordkirby(){
        setImage(standingkirby);
    }
    public void act() 
    {
        jump();
        move();
        checkLives();
        if(Greenfoot.isKeyDown("space")){
            swingsword();     
        }
        if(isAtEdge()){
            movetonextworld();}

        showtext();
    }

    public void move(){
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+5, getY());
            if(variablecontainer.counter%10==0){
                runanimation();}
            

        }
        else if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-5, getY());
            if(variablecontainer.counter%10==0){
                runanimation();}
           

        }
        else{
            setImage(standingkirby);

        }
    }   

    public void swingsword(){
        int bosshp=boss.hp;//cpuld not get boss.hp in else statement
        setImage("swordanimation3.png");
        List enemies = getObjectsInRange(100,enemies.class);
        List boss= getObjectsInRange(100,boss.class);
        if(enemies.size()>0){
            enemies enemy=(enemies)enemies.get(0);
            
            
            
            
            
    
            getWorld().removeObject(enemy);
        }
        else if(boss.size()>0){
                bosshp--;          
        }
        
    }

    public void runanimation(){

        if (getImage() == (standingkirby))
        {
            setImage(image1);
        }
        else if(getImage() == image1)
        {
            setImage(image2);
        }
        else if(getImage() == image2)
        {
            setImage(image3);
        }

        else{
            setImage(image1);
        }
    }

    public void swinganimation(){
        setImage(swing3);
        swingsword();
    }

}
