import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
    VirtualPet p = new VirtualPet();
    public Runner(){
        System.out.println(randy(100));
        p.exercise();
        takeABeat(1000);
        p.feed();
        getAnswer("If you say 'among' or 'us' here it will swtich its face");
        p.over(getBoolean("Is it over?"));
        numberGuessing();
    }
    
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }
    public int randy(int max){
        Random rand = new Random();
        int int_random = rand.nextInt(max);
        return int_random;
    }
    public void numberGuessing(){
        if (getBoolean("do you want to play a game")){
        p.ecstatic();
        int x = randy(getInt("What is the max number"));
        int g = -1;
        int c = 0;
        while (x != g){
            int t = getInt("Guess a number");
            if  (t != x){
                if (t > x){
                    p.high();
                    c++;
                    p.changeFace(p ,c);
                }
                else{
                    p.low();
                    c ++;
                    p.changeFace(p ,c);
                }
            }
            else{
            p.win(c,x );
            }
            }
        }
        else p.enraged();
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
    if (s.equals("no")){
        s="false";
    }
    boolean x = Boolean.parseBoolean(s);
    return x;
    }
    
    
    
    
    public static void main(String[] args) {
        new Runner();
    }
}