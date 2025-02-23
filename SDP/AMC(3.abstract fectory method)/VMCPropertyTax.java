public class VMCPropertyTax implements PropertyTax
{
	public double tax;
	public double propertyTax(double amount) 
	{
		tax=2 * amount/100;
        return tax;
	}
}