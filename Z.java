import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Z extends Keyboard
{
    /**
     * Act - do whatever the Z wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld w = (MyWorld) getWorld();
        String key = Greenfoot.getKey();
        if(w.getCounter() < 5 ){
            if(Greenfoot.mouseClicked(this)){
                w.word.set(w.counter,"Z");
                w.counter++;
            }
        }
    }
}
