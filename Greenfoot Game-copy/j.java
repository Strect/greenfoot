import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class j extends World
{

    /**
     * Constructor for objects of class j.
     * 
     */
    public j()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        car car = new car();
        addObject(car,294,359);
        Obstacle1 obstacle1 = new Obstacle1();
        addObject(obstacle1,541,206);
        obstacle2 obstacle2 = new obstacle2();
        addObject(obstacle2,79,203);
        counter counter = new counter();
        addObject(counter,357,76);
        counter.setLocation(66,34);
        counter.setLocation(50,28);
        counter.setLocation(94,47);
        car.setLocation(350,575);
        obstacle1.setLocation(616,226);
        obstacle2.setLocation(101,241);
        car.setLocation(345,520);
    }
    
}
