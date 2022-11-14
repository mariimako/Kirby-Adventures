import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kirbyobject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kirbyobject extends Actor
{

    /**
     * Act - do whatever the kirbyobject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image1=new GreenfootImage("object1.png");
    private GreenfootImage image2= new GreenfootImage("object2.png");
    private GreenfootImage image3= new GreenfootImage("object3.png");
    private GreenfootImage image4= new GreenfootImage("object4.png");
    public int xSpeed=0;//speed of boomerang
    public boolean distanceFromKirby=false; 
    public void act() 
    {
        // Add your action code here.

        if(isTouching(throwkirby.class)){
            throwkirby.thrown=false;//if boomerang at throwkirby , delete self 
            getWorld().removeObject(this);
        }
        else{
            moveback();//boomerang effect
            flyinganimation();
            checkIntersecting();}//checkintersecting with enemies and boss and edge
    }

    public void checkIntersecting(){
        if(isTouching(boss.class)){
            if(variablecontainer.counter%50==0){
                boss.hp--;}
        }  
        else if(isTouching(enemies.class)){
            Actor enemy=getOneIntersectingObject(enemies.class);//initialize
            getWorld().removeObject(enemy);
            throwkirby.thrown=false;//return flase os that can be thrown again (kirby can throw)
            getWorld().removeObject(this); 
        }
        else if(isAtEdge()){
            throwkirby.thrown=false;
            getWorld().removeObject(this);

        }
    }

    public void flyinganimation(){//animation
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else if(getImage() == image2)
        {
            setImage(image3);
        }
        else if(getImage() == image3)
        {
            setImage(image4);
        }
        else
        {
            setImage(image1);
        }

    }

    public void moveback(){//if kirby moves while thrown, the boomerang will just move fowards and not come back
        if(getX()==throwkirby.xPos+400){//if 800 units away from kirby, return true
            distanceFromKirby=true;
        }
        if (distanceFromKirby==false){//if not thrown  
            xSpeed++; // travels foward, with increasing speed
            setLocation(getX()+xSpeed, getY());
        }
        else
        { if(distanceFromKirby==true){//if  distance from kirby 800
                xSpeed = -15; // add travel back speed  
                setLocation(getX()+xSpeed, getY());
            }}
    }
}
