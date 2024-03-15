import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class help extends World //Help Class is for help screen, players taught how to play before getting the option to to the main game screen
{

    /**
     * Constructor for objects of class help. 
     */
    public help()
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
        car car = new car(); //Car for Practice Movement
        addObject(car,291,312);
        
        HowToPlay HowToPlay=new HowToPlay(); //Instructions image
        addObject(HowToPlay, 300, 130);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter")) //Button to trigger Game Gamestate
            Greenfoot.setWorld(new Play());
    }

}
