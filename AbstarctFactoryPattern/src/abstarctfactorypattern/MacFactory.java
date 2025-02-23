/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarctfactorypattern;

/**
 *
 * @author Jaydip
 */
public class MacFactory {
    public static Button MacBotton() {
             return new MacBtn();
          
        }
       public static Checkbox Maccheck() {
             return new MacCheck();
          
        }
        public static radiobtn MacRbtn() {
             return new McaRadio();
          
        }
}
