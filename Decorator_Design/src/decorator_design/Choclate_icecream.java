/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design;

/**
 *
 * @author Jaydip
 */
public class Choclate_icecream  extends Ice_Cream{
  
    double cost=50;
    String desc="Choclate Ice-Cream";
    
    @Override
    public String getDescription() {
         return desc;
    }

    @Override
    public Double getCost() {
        return cost;
    }
}
