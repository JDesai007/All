/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;
import java.util.*;
/**
 *
 * @author Jaydip
 */
public class ClientMain {  // Main clientcode
    public static void main(String[] args)  { //main method to start runninng
        
        Scanner sc=new Scanner(System.in);   // create object of Scanner
        String database;  
        
        System.out.println("Enter the DataBase name:");
        database=sc.nextLine();       // Input database name from user
        
        DatabaseConnection conn = DatabaseFactory.getDatabaseConnection(database);  // create the object of DatabaseConnection interface
        
        
        try {
            conn.connect();    // call the connnect method        
            conn.disconnect(); // call the Disconnnect methood
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        } 
    }
}
