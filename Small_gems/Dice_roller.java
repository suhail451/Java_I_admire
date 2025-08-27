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
import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Random;
public class Dice_roller {
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random =new Random ();
        
        
        
        boolean choice=true;
        
        
        while(choice){
            System.out.println("1 for roll the dice\n2 for quit the game ");
            int ch=sc.nextInt();
            if(ch==1){
            int dice=random.nextInt(6)+1;
                System.out.println("");
            System.out.println("  "+dice);
            System.out.println("");}
            else if(ch==2){
            choice=false;
            }
        
        }
        
        
    }
    
}
