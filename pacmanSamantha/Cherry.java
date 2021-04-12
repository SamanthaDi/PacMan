import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Actor
{
    public Cherry()
    {
        setImage("images/cherry.png");
    }
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    PacmanW thisGame;
    public void act() 
    {
        Actor Cherry = getOneIntersectingObject(Pacman.class);
        if (Cherry != null) {
            getWorld().removeObject(this);
            thisGame.score+=30;
        }
    }     
}
