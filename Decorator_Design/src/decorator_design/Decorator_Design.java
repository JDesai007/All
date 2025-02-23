/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator_design;

import java.util.Scanner;

/**
 *
 * @author Jaydip
 */
public class Decorator_Design {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Ice_Cream ice_Cream;
        double count=0;
        String icecream;
        System.out.println("Enter Ice-Cream name(choclate,venilla): ");
        icecream=sc.next();
        switch (icecream.toLowerCase()) {
            case "choclate":
                ice_Cream=new Choclate_icecream();
                break;
            case "venilla":
                ice_Cream=new Venilla_icecream();
                break;
           
            default:
                throw new AssertionError();
        }
    
        
        String decorator;
        System.out.println("Enter Decorator for "+ icecream +" to add new item on Ice-Cream(dryfruit,peanut): ");
        decorator=sc.next();
       
//        do{
        switch (decorator.toLowerCase()) {
            case "dryfruit":
                
                ice_Cream=new Dryfruit_icecream(ice_Cream);
                break;
            
            case "peanut":
               
                ice_Cream=new peanut_icecream(ice_Cream);
                break;
             
           
//            case "done":
//               count=1;
//                
//                break;
                 
            default:
                throw new AssertionError();
        }
        
//        }while(count==1);
        System.out.println("Description: "+ice_Cream.getDescription());
        System.out.println("Cost: "+ice_Cream.getCost());
       
    }

    
}
