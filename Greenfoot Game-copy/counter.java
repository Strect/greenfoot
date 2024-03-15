import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
Score Counter Class. Used to Display and Track players Score
 */

public class counter extends Actor
{
    public static int score=0; //Score Variable 
    public static int getScore() //Method for score counter 
    {
    return score;
    }
    
    public void act() //Act Method
    {
    setImage(new GreenfootImage("Score:"+score,40, Color.WHITE, Color.BLACK)); //Score Counter On Play Screen
    
    if (!(getWorld() instanceof Win)){  //Game Over World--> score stops increasing.
    score++;//Score increases on Play gamestate
    }   
    }

}
