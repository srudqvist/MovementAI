import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plains here.
 * 
 * @author (Chris Branton) 
 * @version (2019-11-25)
 */
public class Plains extends World
{
    // Testing
    final private int NUM_MICE = 3;
    private final int NUM_ELEPHANTS = 6;
    
    
    /**
     * Constructor for objects of class Plains.
     * 
     */
    public Plains()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void populate(int numMice, int numElephants)
    {
        for (int mice = 0; mice < numMice; mice++)
        {
            addObject(new Mouse (), Greenfoot.getRandomNumber(getWidth()), 
                Greenfoot.getRandomNumber(getHeight()));
        }
        for (int elephant = 0; elephant < numElephants; elephant++)
        {
            addObject(new Elephant(), Greenfoot.getRandomNumber(getWidth()), 
                Greenfoot.getRandomNumber(getHeight()));
        }
      
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        populate(NUM_MICE, NUM_ELEPHANTS);
    }
}
