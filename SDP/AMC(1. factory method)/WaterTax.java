public class WaterTax implements TaxCalculator
{
	private double taxAmount = 0.01;
	
	public double billCalculate(double amount)
	{
		return amount * taxAmount;
	}
  
	public double getTaxAmount(){
		
		return taxAmount;
		
	}
}