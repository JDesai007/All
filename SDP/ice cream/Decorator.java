
// package decorator;


public class Decorator {

  
    public static void main(String[] args) {
       Vanilla v1=new Vanilla();
        System.out.println(v1.getDescription());
        System.out.println(v1.getCost());
        
        
        
        
        IceCream i1=new CashewNut((IceCream)new Vanilla());
        System.out.println(i1.getDescription());
        System.out.println(i1.getCost());
        
        
        IceCream i2=new PeaNut((IceCream)new Vanilla());
         System.out.println(i2.getDescription());
        System.out.println(i2.getCost());
       
       
    }
    
}
