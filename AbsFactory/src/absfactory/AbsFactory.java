/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package absfactory;
import java.util.*;
/**
 *
 * @author Jaydip
 */
public class AbsFactory {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String comm;
        
        System.out.println("Enter the Commponent name:");
        comm=sc.nextLine();
        
        Window co = Factory.getcomponentName(comm);
        try {
            co.getcomponent(); // call the Disconnnect methood
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        } 
    }
    
}
