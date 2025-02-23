/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design;

/**
 *
 * @author Jaydip
 */
public class peanut_icecream extends Decorator_icecream{

    Ice_Cream icecream;
    
    peanut_icecream(Ice_Cream icecream)
    {
        this.icecream=icecream;
    }
    
    @Override
    public String getDescription()  {
        return icecream.getDescription()+" with Peanut";
    }
    
    @Override
    public Double getCost() {
        return icecream.getCost()+20;
    }
    
}
