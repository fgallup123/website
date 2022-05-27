import greenfoot.*;
//import java.lang.math;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int round;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.round = 6;
    }
    
    public void act() {
        generateZombies();
        
    }
    
    public void generateZombies() {
        int numOf = Greenfoot.getRandomNumber(round*round);
        for(int i=0; i<numOf; i++) {
            int rand = Greenfoot.getRandomNumber(1000);
            Zombie zombie = new Zombie();
            zombie.alive();
            addObject(zombie, rand, 750);
            
        }
        
    }
}
