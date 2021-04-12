import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class greenDot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greenDot extends Actor
{
    public greenDot()
    {
        setImage("images/greenDot.png");
    }

    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    PacmanW thisGame;
    public void act() 
    {
        Actor greenDot = getOneIntersectingObject(Pacman.class);
        if (greenDot != null) {
            getWorld().removeObject(this);
            thisGame.score+=10;
        }
    }     
}
