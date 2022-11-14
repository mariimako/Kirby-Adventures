import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class neutralenemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class neutralenemies extends enemies
{
    /**
     * Act - do whatever the neutralenemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This cannot give ability to kirby even when swallowed
     */
    public GreenfootImage image1=new GreenfootImage("enemy1.png");
    public GreenfootImage image2=new GreenfootImage("enemy2.png");
    public void act() 
    {
        move(-2);// move to left
        if(variablecontainer.counter%20==0){
            runanimation();//run animation
        }
        checkIntersecting();// check if at edge or hitting kirby
        
    }
    public void runanimation(){
        if(getImage()==image1){
            setImage(image2);
        }
        else{
            setImage(image1);
        }
    }
}
