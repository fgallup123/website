import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
    }
    
    public void act() {
   
        
    }
    
    public void generateZombies() {
        for(int i=0; i++; i<numbOf) {
            int rand = random()*1000 + 1;
            Zombie zombie = new Zombie();
            addObject(
            
        }
        
    }
}
