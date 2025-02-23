/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarctfactorypattern;

/**
 *
 * @author Jaydip
 */
public class WindowFactory {
      public static Button WindowBotton() {
             return new WindowBtn();
          
        }
       public static Checkbox Windowcheck() {
             return new Windowcheck();
          
        }
        public static radiobtn WindowRbtn() {
             return new WindowRadio();
          
        }
}
