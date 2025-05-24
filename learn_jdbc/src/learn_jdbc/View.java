package learn_jdbc;

import java.util.Scanner;

public class View {
    private Scanner sc;
    
    public View() {
        this.sc = new Scanner(System.in);
    }
    
    // Your original display/input methods
    public void showMenu() {
        System.out.println("\n==== STUDENT DATABASE MENU ====");
        System.out.println("1. Insert new Student ");
        System.out.println("2. Fetch Student details");
        System.out.println("3. Update student information");
        System.out.println("4. Delete Student record");
        System.out.println("5. Exit the program ");
        System.out.print("Choose option: ");
    }
    
    public int getChoice() {
        return sc.nextInt();
    }
    
    public int getRollNumber() {
        System.out.print("Enter Roll: ");
        return sc.nextInt();
    }
    
    public String getName() {
        System.out.print("Enter Name: ");
        return sc.next();
    }
    
    // For displaying results (your original print statements)
    public void showInsertSuccess() {
        System.out.println("Student inserted successfully");
    }
    
    public void showUpdateSuccess() {
        System.out.println("Name updated successfully");
    }
    
    // ... Add other display methods as needed
}