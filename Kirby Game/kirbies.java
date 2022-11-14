import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kirbies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kirbies extends Actor
{
    /**
     * Act - do whatever the kirbies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int ySpeed=0;
    public static int level=0;//number represents level number, everytime at egde add one, see which level to go to
    public void act() 
    {
        //this is the kirbies class where it contains methods that I use in all kirbies, so more efficient in a class
    }    

    public void checkLives(){
        if(variablecontainer.lives==0){
            int hint=Greenfoot.getRandomNumber(5);//show a random hint when the user dies
            String text="";
            if(hint==0){
                text="If you dont catch the boomerang, you will have to wait until it dissapears to the edge to throw another one! If you stay still while you thrown the boomerang, it will comeback!";
            }
            else if(hint ==1){
                text="While you've swallowed an enemy/object, you can only jump or spit out(press e)!!";

            }
            else if(hint ==2){
                text="The small bomb that appears at your position explodes after a few seconds! Make sure to move away, as it kills you instantly!";

            }
            else if(hint ==3){
                text="You cannot swallow the boss, you can only damage it throw spitting out the bullets that you can swallow or getting an ability";

            }
            else if(hint ==4){
                text="Some things don't have abilities, others do. Somethings cannot be swallowed, others can. Some things kill you instantly, somethings do not.";

            }
            Greenfoot.ask("Game Over. Press enter to restart. Hint:"+text);//show one of above text
            level=0;//reset variable
            Greenfoot.setWorld(new titleScreen()); }//reset to title screen
    }

    public void movetonextworld(){
        level++;//adds one to level, if level=1, move to world 2, if else than 2, move to world3
        if(level==1){
            Greenfoot.setWorld(new World2());
            variablecontainer.groundlevel = 500;
        }
        else{
            boss.hp=boss.hp;
            Greenfoot.setWorld(new world3());
            variablecontainer.groundlevel=600;
        }
    }

    public void jump()
    {
        boolean onGround = (getY() == variablecontainer.groundlevel);
        if (onGround==false){//if not on ground   
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=variablecontainer.groundlevel) // has landed (reached ground level)
            {
                setLocation(getX(), variablecontainer.groundlevel); // set on ground
                // Greenfoot.getKey(); // clears any key pressed during jump
            }
        }
        else // on ground
        { if(onGround==true){
                if ("w".equals(Greenfoot.getKey())) // jump key detected
                {
                    ySpeed = -15; // add jump speed
                    setLocation(getX(), getY()+ySpeed); // leave ground
                }
            }}
    }

    public void showtext(){//shows remaining lives
        getWorld().showText("Lives",100,100);
        getWorld().showText(variablecontainer.lives+"",100,150);

    }
}
