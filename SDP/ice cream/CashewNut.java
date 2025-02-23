
// package decorator;

public class CashewNut extends Additional {
    CashewNut( IceCream nIceCream)
    {
        super(nIceCream);
    }
    public String getDescription()
    {
       return super.getDescription()+" with CashewNut";
    }
    public double getCost()
    {
        return super.getCost()+200;
    }
}
