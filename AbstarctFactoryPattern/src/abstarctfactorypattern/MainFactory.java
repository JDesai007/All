/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstarctfactorypattern;

/**
 *
 * @author Jaydip
 */
public class MainFactory {
    
    
      public static Button WindowBotton() {
             return new WindowBtn();
           
          
        }
       public static Checkbox Windowcheck() {
             return new Windowcheck();
          
        }
        public static radiobtn WindowRbtn() {
             return new WindowRadio();
          
        }
         public static Button MacBotton() {
             return new MacBtn();
          
        }
       public static Checkbox Maccheck() {
             return new MacCheck();
          
        }
        public static radiobtn MacRbtn() {
             return new McaRadio();
          
        }
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

