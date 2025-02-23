/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design;

/**
 *
 * @author Jaydip
 */
public class Dryfruit_icecream extends Decorator_icecream{

    Ice_Cream icecream;
    
    Dryfruit_icecream(Ice_Cream icecream)
    {
        this.icecream=icecream;
    }
    
    
public String getDescription()  {
        return icecream.getDescription()+" with Dry-Fruit";
    }
    
    @Override
    public Double getCost() {
        return icecream.getCost()+30;
    }
}
