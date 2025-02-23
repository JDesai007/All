
// package decorator;

public abstract class Additional implements IceCream {
    private IceCream nIceCream;
    Additional( IceCream nIceCream)
    {
        this.nIceCream=nIceCream;
    }
    public double getCost()
    {
        return nIceCream.getCost();
    }
    public String getDescription()
    {
        return nIceCream.getDescription();
    }
    
}
