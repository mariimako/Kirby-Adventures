import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int hp=25;
    public  boss(){
        hp=25;//reset hp 
    }

    public void act() 
    {
        showlives();
        move();
        spawnstuff();
        // Add your action code here.

    }   

    public void shootBullet(){

        getWorld().addObject(new bullet(), getX()-100,getY());

    }

    
    public void showlives(){
        getWorld().showText("Boss HP",900,100);
        getWorld().showText(hp+"",900,150);//show hp
        if(hp==0){
            Greenfoot.ask("Congrats! You cleared the game!. Press Enter to restart");
            Greenfoot.setWorld(new titleScreen());//if boss hp = zero, game cleared
        }
    }

    public void move(){
        if(variablecontainer.counter%50==0){
            move(10);
        }
        if(variablecontainer.counter%75==0){//move a bit
            move(-10);
        }

     }
    public int getRandomNum(int start,int end)//gets random number not from 0 to number but any number, and+1 to include last numebr(
    //getRandomNumber only gets from 0 to (given number)-1.
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    public void spawnstuff(){//spawns bombs and attacks and enemies every once in a while
        if(variablecontainer.counter%50==0){
            shootBullet();}
        if(variablecontainer.counter%150==0){
            getWorld().addObject(new bossbomb(),kirby.xPos,600);//spawn at kirby postition
        }
        if(variablecontainer.counter%520==0){
            getWorld().addObject (new flyenemy(), 1300,100);
        }
        if(variablecontainer.counter==400){
            getWorld().addObject (new throwenemy(), 900,600);
        }
        if(variablecontainer.counter%625==0){
            getWorld().addObject (new blackhole(), getRandomNum(100,900), 500);//spawn at random place
        }
    }
}

