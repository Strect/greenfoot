import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x=getX();
        int y=getY();
        boolean collision=false;
        boolean dash=false;

        
        
        if (Greenfoot.isKeyDown("W"))
            y--;
        if (Greenfoot.isKeyDown("A"))
            x--;
        if (Greenfoot.isKeyDown("S"))
            y++;
        if (Greenfoot.isKeyDown("D"))
            x++;
        setLocation(x,y);
        
        //if (isTouching(Obstacle1.class))
            //collision=true;
            
        if (Greenfoot.isKeyDown("space"))// add timer so that can only use dash ability after cooldown
            dash=true;
            x=x+20;
            
        if (dash==true)
            x=x+20;
            
            

        
    }
}
