import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Square_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square_1 extends Square
{
    /**
     * Act - do whatever the Square_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MyWorld w = (MyWorld) getWorld();
     
        if("enter".equals(w.getKey())){
            //setImage("GreenSquare.png"); 
            
            //make a set method in world to avoid calling instance variable
            w.attempt++;
            
            
            for(int j=0; j<5; j++){
                w.showText(w.wordStorage[w.attempt/30][j], 100 + j*50, (w.attempt/30 + 1) * 50);
            }
            
            if(w.attempt == 1){
                if(w.word.get(0).equals(w.targetWord.charAt(0))){
                    
                }
            }
            

        }
    }
}
