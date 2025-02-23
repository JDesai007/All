public class VMCWaterTax implements WaterTax
{
	public double tax;
	public double waterTax(double amount) 
	{
		tax=4 * amount/100;
        return tax;
	}
}