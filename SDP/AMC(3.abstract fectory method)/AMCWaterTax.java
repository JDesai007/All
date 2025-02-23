public class AMCWaterTax implements WaterTax
{
	public double tax;
	public double waterTax(double amount) 
	{
		tax=2 * amount/100;
        return tax;
	}
}