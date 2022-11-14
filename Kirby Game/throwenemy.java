import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class throwenemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class throwenemy extends enemies
{
    /**
     * Act - do whatever the throwenemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image1=new GreenfootImage("throwanimation1.png");
    private GreenfootImage image2= new GreenfootImage("throwanimation2.png");
    private GreenfootImage image3= new GreenfootImage("throwanimation3.png");
    private GreenfootImage image4= new GreenfootImage("throwanimation4.png");
    public throwenemy()
    {
        setImage(image1);//set image to first one
    }

    public void act()
    {
        if(variablecontainer.counter%30==0){
            throwanimation();}//throw animation evry once in a wjile
    }

    public void throwanimation(){
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
            throwobject();//throw after animation
        }
        else
        {
            setImage(image1);
        }
    }

    public void throwobject(){//create object to be thrown
        getWorld().addObject(new object(),getX()+10,getY());
    }
}
