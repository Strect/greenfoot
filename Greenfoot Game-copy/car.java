import greenfoot.*;  

/**
This is the Player Class, All of the Players Code is here(mainly movement and collision)
 */

public class car extends Actor
{
        public static int lives=100; //Health Variable
        int speed=5; //Player Movement Speed
        boolean collision=false; //Collision Variable
        boolean ability=true; //Special Ability Variable
        long startTime=0;//time variable for Ability
        boolean abilityUsed=false; //variable to only use ability once
        
    public static int getLives() { //function to return lives, so i can display HealthBar on Play gamestate
        return lives;
    }
        
    public void act() //Main Act Method
    {
        int x=getX();
        int y=getY(); //Track X and Y Coordinates of Player

    if (getWorld() instanceof Play || getWorld() instanceof help)  //Only Move on Help Screen or Play Screen
    {
        if (Greenfoot.isKeyDown("W")) //WASD Key Movement
            y=y-speed;
        if (Greenfoot.isKeyDown("A"))
            x=x-speed;
        if (Greenfoot.isKeyDown("S"))
            y=y+speed;
        if (Greenfoot.isKeyDown("D"))
            x=x+speed;
        if (Greenfoot.isKeyDown("RIGHT")) //Rotating/Turning Car Movement
            turn(speed);
        if (Greenfoot.isKeyDown("LEFT"))
            turn(-speed);

        setLocation(x,y); //Update Car Location after Movement
    }
    
    if (Greenfoot.isKeyDown("SPACE") && ability==true && abilityUsed==false){ //Invincibility Ability
        ability=false; //ability activated
        startTime = System.currentTimeMillis();//store the current time
    }
    if (ability==false && startTime>0){ //after ability in use, check for 5 seconds
        long currentTime=System.currentTimeMillis();
        if (currentTime-startTime>=5000){ //subract current time from start time
        ability=true; //after 5 seconds set ability back to off
        abilityUsed=true;
    }
    }

    
    if (isTouching(Obstacle1.class) && collision==false && ability==true) { //collision detection with Obstacle1
            collision = true;
        }
    else if (isTouching(obstacle2.class) && collision==false && ability==true) { //collision detection with Obstacle2
            collision = true;
        }

        // Decrease Health only when there is a collision
        if (collision==true) { 
            lives -= 1;
            collision = false; // Reset collision Variable to stop losing Health
        }

        // Game over when lives reach 0 
        if (lives == 0) {
            Greenfoot.setWorld(new Win()); //Trigger End Gamestate
        }

          

        
    }
    
}
