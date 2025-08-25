/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template 
 */
package Small_gems;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Password_Strenght {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean choice=false;
        
        while(!choice){
        System.out.println("Enter the Password  :");
        String pass=sc.nextLine();
        
        boolean hasUppercase=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;
        boolean hasLetter=false;
        
        
        
        for(int i=0;i<pass.length();i++){
        
            char ch=pass.charAt(i);
           
            if(Character.isUpperCase(ch)){
        
                hasUppercase=true;
            } 
            else if(Character.isDigit(ch)) {
        
                hasDigit=true;
            } else if(Character.isLetter(ch)){
              hasLetter=true;
            }else{
            hasSpecial=true;}
            
        }
      
        if(pass.length() >= 8 && hasDigit&& hasUppercase && hasSpecial){
            
        System.out.println("Password is Strong! ");
            choice=true;
        }
        else if(pass.length() < 8) 
            System.out.println("❌ Password must be at least 8 characters long.");
        else if(!hasUppercase) 
            System.out.println("❌ Password must contain an uppercase letter.");
        
        else if(!hasDigit) 
            System.out.println("❌ Password must contain a digit.");
        else if(!hasSpecial) 
            System.out.println("❌ Password must contain a special character.");
     
        }
        
        }
    
    } 
    
    
