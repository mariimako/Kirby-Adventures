import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flyenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flyenemy extends enemies
{
    /**
     * Act - do whatever the flyenemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This is a flying enemy that drops bombs occasionally
     */
    public GreenfootImage animation1=new GreenfootImage("flyenemy1.png");
    public GreenfootImage animation2=new GreenfootImage ("flyenemy2.png");
    public GreenfootImage animation3=new GreenfootImage("flyenemy3.png");
    public flyenemy(){
        animation1.scale(100,100);
        setImage(animation1);
    }
    public void act() 
    {
        move(-3);
        if(variablecontainer.counter%15==0){//animate only a few times to make it look natural
        move();}
        bomb();// drop bomb
        checkIntersecting();//remove if at edge
    }    
    public void bomb(){
        if(variablecontainer.counter%100==0){//drop bomb every once in a while
            getWorld().addObject(new bomb(), getX(),getY()+50);
        }
    }
    public void move(){//animation
        if(getImage()==animation1){
            setImage(animation2);
        }
        else if(getImage()==animation2){
            setImage(animation3);
        }
        else if(getImage()==animation3){
            setImage(animation1);
        }
        GreenfootImage animation=getImage();
        animation.scale(100,100);//make smaller

    }
}
