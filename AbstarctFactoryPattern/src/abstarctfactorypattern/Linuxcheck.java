/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarctfactorypattern;

/**
 *
 * @author Jaydip
 */
public class Linuxcheck implements Checkbox {
    String check;
    Linuxcheck()
    {
       check="Linux CheckBox"; 
    }
    @Override
    public String getcheck() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return check;
    }
    
}
