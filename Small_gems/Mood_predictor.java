/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Small_gems;

/**
 *
 * @author arain
 */
import java.util.Random;
import java.util.Scanner;
public class Mood_predictor {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        boolean choice=true;
        
        while(choice){
            System.out.println("Enter your name please:");
            String name=sc.nextLine();

            String[]emojis={"😀","😂","😋","😣","😍","💪","🎻","😴"};
            int mood=random.nextInt(emojis.length);
        
            System.out.println("Hy "+name+",today your mood is " +emojis[mood]);
            System.out.println("");
            System.out.println("1 Replay\n2 Quit");
            int ch=sc.nextInt();
            sc.nextLine();
            
            if(ch==2){
                choice=false;
            }
            
        
        }
    }
    
}
