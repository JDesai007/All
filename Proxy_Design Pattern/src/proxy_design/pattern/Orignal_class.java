/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_design.pattern;

/**
 *
 * @author Jaydip
 */
public class Orignal_class implements Calculation {

    double a;
    double b;
    public Orignal_class(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double SumOfNumber() {
        System.out.println("Admin");
        return a+b;
    }
    
}
