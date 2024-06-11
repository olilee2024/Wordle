import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M extends Keyboard
{
    /**
     * Act - do whatever the M wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld w = (MyWorld) getWorld();
        String key = Greenfoot.getKey();
        if(w.getCounter() < 5 ){
            if(Greenfoot.mouseClicked(this)){
                w.word.set(w.counter,"M");
                w.counter++;
            }
        }
    }
}
