import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Actor
{
    /**
     * Act - do whatever the Square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld w = (MyWorld) getWorld();
     
      
        if(("enter".equals(w.getKey()) || Greenfoot.mouseClicked(w.a)) && w.getCounter() == 5){
            
            for(int j=0; j<5; j++){
                w.showText(w.wordStorage[w.attempt][j], 100 + j*50, (w.attempt + 1) * 50);
            }
            
            
            w.attempt++;
            w.counter = 0;
            
            
        }
        
    }
    
    
}
