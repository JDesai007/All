public class AMCPropertyTax implements PropertyTax
{
	public double tax;
	public double propertyTax(double amount) 
	{
		tax=3 * amount/100;
        return tax;
	}
}