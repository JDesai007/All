public class AMCFactory implements AbstractFactory
{
	public PropertyTax getTaxP()
	{
        return new AMCPropertyTax();//amc property tax
	}
	public WaterTax getTaxW()
    {        
        return new AMCWaterTax();//amc water tax
	}		
}