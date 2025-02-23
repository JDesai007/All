/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_design.pattern;

/**
 *
 * @author Jaydip
 */
public class Proxy_class implements Calculation{

    double a=10;
    double b=20;
    
    @Override
    public double SumOfNumber() {
        System.out.println("Guest");
        return a+=b;
    }
    
}
