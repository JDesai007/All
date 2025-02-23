/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxy_design.pattern;
import java.util.*;
/**
 *
 * @author Jaydip
 */
public class Proxy_DesignPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the role:");
       String n;
       n=sc.nextLine();
       
       if(n=="a")
       {
           Proxy_class p=new Proxy_class();
           p.SumOfNumber();
       }
       else if(n=="g")           
       {
           Orignal_class o=new Orignal_class(10,20);
           o.SumOfNumber();
       }
       else
       {
           Proxy_class p=new Proxy_class();
           p.SumOfNumber();
       }
    }
    
}
