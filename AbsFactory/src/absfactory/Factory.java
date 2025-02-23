/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absfactory;

/**
 *
 * @author Jaydip
 */
public class Factory {
    public static Window getcomponentName(String com)
    {
        switch(com)
        {
            case "button":
                return new Button();
                
            case "radio":
                return new Radio();
               
            case "check":
                return new Check();
             default:
                throw new IllegalArgumentException("Unsupported database type: " + com);
        }
        
    }

  
}
