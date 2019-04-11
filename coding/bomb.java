import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(getY()<=5 || getY() >= getWorld().getHeight()-5)
        turn(180);
        Actor turtle = getOneObjectAtOffset(0,0, turtle.class);
        if(turtle!=null){
            removeTouching(turtle.class);
            Greenfoot.stop();
            getWorld().addObject(new kalah(),300,200);
    }    
}
}
