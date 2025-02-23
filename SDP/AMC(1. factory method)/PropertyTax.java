public class PropertyTax implements TaxCalculator
{
	private double taxAmount = 0.04;
	
	public double billCalculate(double amount)
	{
		return amount * taxAmount;
	}
  
	public double getTaxAmount(){
		
		return taxAmount;
		
	}
}