import greenfoot.*;  
/**
This Class is for the Grey Obstacle 
*/
public class Obstacle1 extends Actor
{
    int speed=5; //Obstacle movement speed
    int score=counter.score; //score variable used for Difficulty Progression
    int angle=Greenfoot.getRandomNumber(5); //Random Turn Angle, element of Randomness to Obstacle movement
  
    public void act() //Act Method, always running when game is running. 
    {
        if (getWorld() instanceof Play) { //only move if game world, other worlds only for aesthetics no movement.
            move(-speed); //obstacle movement
            turn (angle); 
        if(isAtEdge()){ //bounce off edge, unique movement
            turn(180);
        }
        if (score>1000){ //increase speed of movement to make game harder. 
            speed=7;
        }
        }
    }

        
}
            
    
    
