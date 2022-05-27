import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    private static int numAlive = 0;
    private static int healthPoints = 1000;
    private static int puddleAnim;
    
    public Zombie() {
        int[] puddleAnim = {dis1.jpeg, dis2.jpeg, dis3.jpeg, dis4.jpeg, dis5.jpeg};
        this.puddleAnim = puddleAnim;
    }
    public void act() {
        setLocation(getX(), getY()+1);
        changeImage()
        if(touching(Bullet) {
               puddlefied();
            
        }
    }
    
    private void changeImage() {
        if(getImageFileName() == walking_right.jpeg) {
            setActorImage(walking_left.jpeg);
            
        }else {
            setActorImage(walking_right.jpeg);   
        }
        
    }
    
    private void puddlefied() {
        
    }
    
    private void death() {
        numAlive -= 1;
        
    }
    
    public void alive() {
        numAlive += 1;
        
    }
}
