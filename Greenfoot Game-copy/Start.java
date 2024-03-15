import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Advit Mehla
 * Oct 20 2023
 */
public class Start extends World //Class Start is for Start Screen, Players introduced to game and given option to play or learn to play(triggers other gamestates)
{

    /**
     * Constructor for objects of class Start.
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();

    }
    
    private void prepare() 
    {
        welcome welcome=new welcome(); // Game Title
        addObject(welcome,303,74);
        instructions instructions=new instructions();//Start Screen Instructions
        addObject(instructions,308,327);

        car car = new car(); //Car on Start Screen, for Aesthetics
        addObject(car,245,216);

        obstacle2 obstacle2 = new obstacle2(); //Obstacles, for Aesthetics of Start Screen
        addObject(obstacle2,333,182);

        Obstacle1 obstacle1 = new Obstacle1();
        addObject(obstacle1,142,149);

        Obstacle1 obstacle12 = new Obstacle1();
        addObject(obstacle12,424,262);

        obstacle2 obstacle22 = new obstacle2();
        addObject(obstacle22,448,148);

        Obstacle1 obstacle13 = new Obstacle1();
        addObject(obstacle13,534,229);

        obstacle2 obstacle23 = new obstacle2();
        addObject(obstacle23,117,246);

        Obstacle1 obstacle14 = new Obstacle1();
        addObject(obstacle14,30,171);

    }
    
    public void act() //Main Start Screen Act Method
    {
        if(Greenfoot.isKeyDown("enter")) //Start Button 
        Greenfoot.setWorld(new Play());
        
        else if(Greenfoot.isKeyDown("h")) //Help Screen Button
        Greenfoot.setWorld(new help());

        
    }
    
    
    

    
    
    

}
