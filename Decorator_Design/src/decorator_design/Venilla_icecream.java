/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design;

/**
 *
 * @author Jaydip
 */
public class Venilla_icecream extends Ice_Cream{

    double cost=20;
    String desc="Venilla Ice-Cream";
    @Override
    public String getDescription() {
         return desc;
    }

    @Override
    public Double getCost() {
        return cost;
    }
}
