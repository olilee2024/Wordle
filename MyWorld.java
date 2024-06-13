import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public ArrayList<String> word = new ArrayList<String>();
    
    public String[][] wordStorage = new String[7][5];

    private String targetWord = "JUMBO";
    public int counter = 0;   
    public int attempt = 0; 
    private String key;
    private List<Actor> squares = new ArrayList<Actor>();
    
    public Enter a = new Enter();
    public MyWorld()
    {    
        // Create a new world with .... cells with a cell size of 1x1 pixels.
        super(400, 550, 1); 
   
        for(int col=0; col<250; col+=50){
            addObject(new Square_1(), 100+col, 50);
            addObject(new Square_2(), 100+col, 100);
            addObject(new Square_3(), 100+col, 150);
            addObject(new Square_4(), 100+col, 200);
            addObject(new Square_5(), 100+col, 250);
            addObject(new Square_6(), 100+col, 300);
        }
        
        addObject(new Q(),61, 372);
        addObject(new W(),92, 372);
        addObject(new E(),123, 372);
        addObject(new R(),154, 372);
        addObject(new T(),185, 372);
        addObject(new Y(),216, 372);
        addObject(new U(),247, 372);
        addObject(new I(),278, 372);
        addObject(new O(),309, 372);
        addObject(new P(),340, 372);
        
        addObject(new A(),80, 420);
        addObject(new S(),110, 420);
        addObject(new D(),140, 420);
        addObject(new F(),170, 420);
        addObject(new G(),200, 420);
        addObject(new H(),230, 420);
        addObject(new J(),260, 420);
        addObject(new K(),290, 420);
        addObject(new L(),320, 420);
        
        addObject(a,70, 468);
        addObject(new Z(),110, 468);
        addObject(new X(),140, 468);
        addObject(new C(),170, 468);
        addObject(new V(),200, 468);
        addObject(new B(),230, 468);
        addObject(new N(),260, 468);
        addObject(new M(),290, 468);
        addObject(new Delete(),330, 468);

            
            
            
        word.add("");
        word.add("");
        word.add("");
        word.add("");
        word.add("");
        
        
        
        
    }
    
    public void act(){
        keyStuff();
        lose();
        
        
        
        for(int i=0; i<5; i++){
            showText(word.get(i), 100 + i*50, (attempt +1) * 50);
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
            delete();  
        }
        if(("enter".equals(key)|| Greenfoot.mouseClicked(a)) && getCounter() ==5){
            enter();
        }
    }
    
    public void delete(){
        word.set(counter-1, "");
        counter--;
    }
    public void enter(){
        for(int i=0; i<wordStorage[0].length; i++){
            wordStorage[attempt][i] = word.get(i);
        }
            
        win();
        
        changeColor();
        
            
        
        word.set(0, "");
        word.set(1, "");
        word.set(2, "");
        word.set(3, "");
        word.set(4, "");
    
        
        
        //attempt++ in square class
    }
    //makes boxes change color after each attempt
    private void changeColor(){
            if(attempt ==0){
                for (Object obj : getObjects(Square_1.class)){ 
                    squares.add((Actor)obj);
                }
                
            }
            else if (attempt==1){
                for (Object obj : getObjects(Square_2.class)){ 
                    squares.add((Actor)obj);
                }
            }
            else if(attempt ==2){
                for (Object obj : getObjects(Square_3.class)){ 
                    squares.add((Actor)obj);
                }
            }
            else if(attempt ==3){
                for (Object obj : getObjects(Square_4.class)){ 
                    squares.add((Actor)obj);
                }
            }
            else if(attempt ==4){
                for (Object obj : getObjects(Square_5.class)){ 
                    squares.add((Actor)obj);
                }
            }
            else if(attempt ==5){
                for (Object obj : getObjects(Square_6.class)){ 
                    squares.add((Actor)obj);
                }
            }
                    
            for(int i=0; i<squares.size(); i++){
                if(word.get(i).equals(""+targetWord.charAt(i))){
                    squares.get(i).setImage("GreenSquare.png");
                }
                else if(targetWord.contains(word.get(i))){
                    squares.get(i).setImage("YellowSquare.png");
                }
                else{
                    squares.get(i).setImage("GraySquare.png");
                }
            }
            
            squares.clear();
    }
    
    private void win(){
        String s = "";
        for(String x:word){
            s += x; 
        }
        if(s.equals(targetWord)){
            showText("You Win!", 200, 530);
            Greenfoot.stop();
        }
        

    }
    private void lose(){
        if (attempt == 6){
            Greenfoot.stop();
            showText("You Lose :( Word: JUMBO", 200, 530);
        }
        
       
    }
    
    public String getKey() {
        return key;
    }  
    public int getCounter() {
        return counter;
    }  
}
