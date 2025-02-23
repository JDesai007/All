
// package decorator;

public class PeaNut extends Additional {
    
    
    PeaNut(IceCream nIceCream)
    {
       super(nIceCream);
    }
    public String getDescription()
    {
        return super.getDescription()+" with peaNut";
    }
    public double getCost()
    {
        return super.getCost()+100;
    }
    
}
