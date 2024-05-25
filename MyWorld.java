import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private ArrayList<String> word = new ArrayList<String>();
    
    public String[][] wordStorage = new String[7][5];

    private int counter = 0;   
    public int attempt = 0; 
    private String key;
    public MyWorld()
    {    
        // Create a new world with .... cells with a cell size of 1x1 pixels.
        super(400, 550, 1); 
        

        for(int row=0; row<300; row+=50){
            for(int col=0; col<250; col+=50){
                addObject(new Square(), 100+col, 50+row);
            }
        }
        
        word.add("");
        word.add("");
        word.add("");
        word.add("");
        word.add("");
        
        
    }
    
    public void act(){
        keyStuff();
        lose();
        //showText(""+attempt, 200, 200);
        //showText(key, 200, 300);
        for(int i=0; i<5; i++){
            showText(word.get(i), 100 + i*50, (attempt/30 +1) * 50);
        }
        
        
        
    }
    
    private void keyStuff(){
        key = Greenfoot.getKey();
        if(counter < 5 ){
            if("a".equals(key)){
                word.set(counter,"A");
                counter++;
            }
            if("b".equals(key)){
                word.set(counter, "B");
                counter++;
            }
            if("c".equals(key)){
                word.set(counter,"C");
                counter++;
            }
            if("d".equals(key)){
                word.set(counter,"D");
                counter++;
            }
            if("e".equals(key)){
                word.set(counter,"E");
                counter++;
            }
            if("f".equals(key)){
                word.set(counter,"F");
                counter++;
            }
            if("g".equals(key)){
                word.set(counter,"G");
                counter++;
            }
            if("h".equals(key)){
                word.set(counter,"H");
                counter++;
            }
            if("i".equals(key)){
                word.set(counter,"I");
                counter++;
            }
            if("j".equals(key)){
                word.set(counter,"J");
                counter++;
            }
            if("k".equals(key)){
                word.set(counter,"K");
                counter++;
            }
            if("l".equals(key)){
                word.set(counter,"L");
                counter++;
            }
            if("m".equals(key)){
                word.set(counter,"M");
                counter++;
            }
            if("n".equals(key)){
                word.set(counter,"N");
                counter++;
            }
            if("o".equals(key)){
                word.set(counter,"O");
                counter++;
            }
            if("p".equals(key)){
                word.set(counter,"P");
                counter++;
            }
            if("q".equals(key)){
                word.set(counter,"Q");
                counter++;
            }
            if("r".equals(key)){
                word.set(counter,"R");
                counter++;
            }
            if("s".equals(key)){
                word.set(counter,"S");
                counter++;
            }
            if("t".equals(key)){
                word.set(counter,"T");
                counter++;
            }
            if("u".equals(key)){
                word.set(counter,"U");
                counter++;
            }
            if("v".equals(key)){
                word.set(counter,"V");
                counter++;
            }
            if("w".equals(key)){
                word.set(counter,"W");
                counter++;
            }
            if("x".equals(key)){
                word.set(counter,"X");
                counter++;
            }
            if("y".equals(key)){
                word.set(counter,"Y");
                counter++;
            }
            if("z".equals(key)){
                word.set(counter,"Z");
                counter++;
            }
        }
        if("backspace".equals(key) && counter != 0){
                word.set(counter-1, "");
                counter--;
        }
        if("enter".equals(key) && getCounter() ==5){
            for(int i=0; i<wordStorage[0].length; i++){
                wordStorage[attempt/30][i] = word.get(i);
            }
            
            String s = "";
            for(String x:word){
                s += x; 
            }
            if(s.equals("BREAD")){
                Greenfoot.stop();
            }
            
            //showText(""+attempt/30, 200, 200);
            //showText(wordStorage[attempt/30].toString(), 200, 200);
            
            word.set(0, "");
            word.set(1, "");
            word.set(2, "");
            word.set(3, "");
            word.set(4, "");
            
            counter = 0;
        }
    }
    private void lose(){
        if (attempt/30 == 6){
            Greenfoot.stop();
        }
    }
    
    public String getKey() {
        return key;
    }  
    public int getCounter() {
        return counter;
    }  
}
