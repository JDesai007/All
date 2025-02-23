/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarctfactorypattern;

/**
 *
 * @author Jaydip
 */
public class LinuxFactory {
    public static Button LinuxBotton() {
             return new LinuxBtn();
          
        }
       public static Checkbox Linuxheck() {
             return new Linuxcheck();
          
        }
        public static radiobtn LinuxRbtn() {
             return new LinuxRadio();
          
        }
}
