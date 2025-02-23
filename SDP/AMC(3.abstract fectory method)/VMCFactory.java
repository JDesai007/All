public class VMCFactory implements AbstractFactory
{
	public PropertyTax getTaxP()
	{
        return new VMCPropertyTax();//vmc property tax
	}
	public WaterTax getTaxW()
    {        
        return new VMCWaterTax();//vmc water tax
	}		
}