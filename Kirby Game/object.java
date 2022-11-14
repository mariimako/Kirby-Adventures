import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class object extends Actor//I dont want kirby to swallow and remove this object, so not in enemy class
{
    /**
     * Act - do whatever the object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. This is thrown by throwenemies, if hit kirby -1 lives
     */
    public int countdown=200;
    public void act() 
    {
        move(-10);// Add your action code here.
        checkIntersecting();
    }

    public void checkIntersecting(){
        if(isTouching(swordkirby.class)||isTouching(kirby.class)){
            variablecontainer.lives--;
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        else{
            if(countdown==0){
                getWorld().removeObject(this);

            }
        }
    }
}
