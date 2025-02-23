/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design;

/**
 *
 * @author Jaydip
 */
public abstract class Ice_Cream {
   
    String descrition;
    public String getDescription(){
        return descrition;
    }
    public abstract Double getCost();
}
