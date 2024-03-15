import greenfoot.*;  

/**
Health Bar for Play Gamestate
 */
public class Lives extends Actor
{
    public void act() //Act Method, called whenever game running
    {
    int lives = car.getLives(); //variable constantly getting updated in act method
    setImage(new GreenfootImage("Health:"+lives,40, Color.GREEN, Color.BLACK)); //Health Bar 
    }
}
