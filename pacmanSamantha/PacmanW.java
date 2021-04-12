import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanW extends World
{
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanW()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        //arriba
        for(int x = 40; x < 815; x+=72){
            this.addObject(new Wall(), x, 30);
        }
        //abajo
        for(int x = 40; x < 815; x+=72){
            this.addObject(new Wall(), x, 570);
        }
        //izquie
        for(int x = 30; x < 260; x+=56){
            this.addObject(new Wall(), 40, x);
        }
        for(int x = 440; x < 600; x+=56){
            this.addObject(new Wall(), 40, x);
        }
        //der
        for(int x = 30; x < 260; x+=56){
            this.addObject(new Wall(), 760, x);
        }
        for(int x = 440; x < 600; x+=56){
            this.addObject(new Wall(), 760, x);
        }
        //medio
        for(int x = 260; x < 600; x+=72){
            this.addObject(new Wall(), x, 380);
        }
        for(int x = 260; x < 400; x+=72){
            this.addObject(new Wall(), x, 220);
        }
        for(int x = 220; x < 380; x+=56){
            this.addObject(new Wall(), 548, x);
        }
        for(int x = 230; x < 380; x+=56){
            this.addObject(new Wall(), 260, x);
        }
        
        
        for(int x = 120; x < 700; x+=72){
            this.addObject(new greenDot(), x, 500);
        }
        for(int x = 120; x < 700; x+=72){
            this.addObject(new greenDot(), x, 100);
        }
        
        addObject(new Pacman(), 130, 370);
        addObject(new blueDot(), 140, 230);
        addObject(new blueDot(), 650, 230);
        
        addObject(new Teleport(), 10, 350);
        addObject(new Teleport(), 800, 350);
        addObject(new Banana(), 350, 300);
        addObject(new Cherry(), 650, 380);
    }
    
    public void act(){
        showText("score: "+ score, 40, 40);
    }
}
