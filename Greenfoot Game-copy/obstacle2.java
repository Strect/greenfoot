import greenfoot.*;  

/**
Obstacle 2 Class
 */
public class obstacle2 extends Actor
{
    int score=counter.score; //Score from counter class, used for difficulty progression.
    int speed=5; //Obstacle Movement Speed
    
    public void act() //Act Method
    {
    if (getWorld() instanceof Play) { //Obstacle Movement
        move(speed);
        turn (1);
    if (score>2000) //Speed/Difficulty Increase
        speed=9;
    }
    }
}
