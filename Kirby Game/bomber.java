import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bomber extends enemies
{
    /**
     * Act - do whatever the bomber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This is the bomber enemy, it can throw bombs that when hit kirby he loses lives
     */
    private GreenfootImage image1=new GreenfootImage("bomber1.png");
    private GreenfootImage image2= new GreenfootImage("bomber2.png");
    private GreenfootImage image3= new GreenfootImage("bomber3.png");
    private GreenfootImage image4= new GreenfootImage("bomber4.png");
    private GreenfootImage image5= new GreenfootImage("bomber5.png");
    private GreenfootImage image6= new GreenfootImage("bomber6.png");
    public static int xPos;
    public bomber(){
        setImage(image1);
    }
    public void act() 
    {
        if(variablecontainer.counter%25==0){//throw bomb every once in a while
        throwbomb();}// Add your action code here.
        checkIntersecting();
    }    

    public void throwbomb(){
        xPos=getX();
        if (getImage() == image1)
        {
            setImage(image2);//this is the throw animation
        }
        else if(getImage() == image2)
        {
            setImage(image3);
        }
        else if(getImage() == image3)
        {
            setImage(image4);

        }
        else if(getImage() ==image4)
        {
            setImage(image5);
        }
        else if(getImage() ==image5)
        {//at one point, throw bomb
            getWorld().addObject(new bomberbomb(), getX()+10, getY()+10);
            setImage(image6);
        }
        else if(getImage() ==image6)
        {
            setImage(image1);
        }

    }
}
