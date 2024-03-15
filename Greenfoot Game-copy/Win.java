import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     */
    public Win() //Win Screen Class, is Winning Gamesstate, players given options to play again.
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        counter counter = new counter(); //Final Score 
        addObject(counter,255,166);
        
        gameOver gameOver = new gameOver(); //Game Over Title
        addObject(gameOver,292,83);
        
        replay replay = new replay(); //Instructions to Play Again
        addObject(replay,285,241);
    }
    public void act(){ //main act Method for this class
        if (Greenfoot.isKeyDown("R")){ //button to restart game
            Greenfoot.setWorld(new Start()); 
            counter.score=0; //reset key variables so can replay
            car.lives=100;
        }
    }
}
