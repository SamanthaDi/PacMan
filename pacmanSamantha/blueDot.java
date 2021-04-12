import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueDot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueDot extends Actor
{
    public blueDot()
    {
        setImage("images/blueDot.png");
    }

    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    PacmanW thisGame;
    public void act() 
    {
        Actor blueDot = getOneIntersectingObject(Pacman.class);
        if (blueDot != null) {
            getWorld().removeObject(this);
            thisGame.score+=50;
        }
    }     
}
