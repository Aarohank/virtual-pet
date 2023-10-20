import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Random;

public class Runner{
    VirtualPet p = new VirtualPet();
    public Runner(){
        System.out.println(randy());
        p.exercise();
        takeABeat(1000);
        p.feed();
        getAnswer("how do you say nosotros in english");
        p.over(getBoolean("Is it over?"));
        System.out.println(randy());
    }
    
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            "String Question?",
            JOptionPane.PLAIN_MESSAGE
       );
       if (p.Mogus(s)){
                p.Sus();
                takeABeat(1000);
        }
       return s;
    }

    public int getInt(String q){
    
        String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         q,
         "Integer Question?",
         JOptionPane.PLAIN_MESSAGE
       );
    int x = Integer.parseInt(s);
    return x;
    }
    
    public boolean getBoolean(String q){
    
        String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         q,
         "Boolean Question?",
         JOptionPane.PLAIN_MESSAGE
       );
    if (s.equals("yes")){
        s="true";
    }
    boolean x = Boolean.parseBoolean(s);
    return x;
    
    }
    public int randy(){
        Random rand = new Random(); 
        int int_random = rand.nextInt(100);
        return int_random;
    }
    public static void main(String[] args) {
        new Runner();
    }
}