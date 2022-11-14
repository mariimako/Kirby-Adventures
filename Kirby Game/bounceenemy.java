import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bounceenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bounceenemy extends enemies
{
    /**
     * Act - do whatever the bounceenemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This enemy bounces, integrating jump method
     */
    public int groundlevel=600;
    public int ySpeed=0;
    public bounceenemy(){
        setLocation(1200,600);
    }
    public void act() 
    {
        // Add your action code here.
        bounce();//always bounce
        move(-2);
        checkIntersecting();//check intersecting with kirby or edge, at enemies.class
    }    
    public void bounce()
    {
        boolean onGround = (getY() == groundlevel);
        if (onGround==false){//if not on ground   
            ySpeed++; // adds gravity effect
            if(getX()%10==0){
                setImage("bounce2.png");
            }
            if(getX()%40==0){//animation
                setImage("bounce3.png");
            }
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundlevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundlevel); // set on ground
            }
        }
        else // on ground
        { if(onGround==true){//always jump if at ground, not after a key is pressed
                    setImage("bounce1.png");
                    ySpeed = -15; // add jump speed
                    setLocation(getX(), getY()+ySpeed); // leave ground
                
            }}
    }
    
}
