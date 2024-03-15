import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends World
{
    private GreenfootSound backgroundMusic;

    /**
     * Constructor for objects of class Play.
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        prepare();
        
        backgroundMusic= new GreenfootSound("15._rush_point.mp3"); //file music

        // Start playing the background music
        backgroundMusic.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() //prepare world 
    {
        car car = new car(); //add Car, main player
        addObject(car,345,520);
        
        Obstacle1 obstacle1 = new Obstacle1(); //Obstacle 1 spawn point
        addObject(obstacle1,616,226);
        
        obstacle2 obstacle2 = new obstacle2();// Obstacle 2 spawn point
        addObject(obstacle2,101,241);
        
        counter counter = new counter(); //Score Tracker
        addObject(counter,94,47);
        
        Lives lives = new Lives(); //Health Tracker
        addObject(lives,91,94);
        

        

    }
        int maxObstacles=5; //Variables for Obstacle Spawn Code
        int numberObstacles=1;
        int lastScore=0; //Outside of Act method so variables only declared once, dont reset every time
        
    public void act(){ //increasing amount of obstacles/difficulty act method
        
        int score=counter.score; //score variable updated checked every time Act method runs
        if (numberObstacles<maxObstacles && score-lastScore>=500){ //conditions for difficulty increase
        numberObstacles++; 
        int obstaclesX= Greenfoot.getRandomNumber(getWidth()); //random x and y spawn point, different every time
        int obstaclesY= Greenfoot.getRandomNumber(getHeight());
        addObject(new Obstacle1(),obstaclesX, obstaclesY); //add extra obstacle, difficulty increase
        addObject(new obstacle2(),obstaclesX,obstaclesY); 
        lastScore=score; //makes it so that conditions for difficulty increase met every 500 score.        
        }
    }
        public void stopped() {
        // Stop the background music
        backgroundMusic.stop();
    }
}
