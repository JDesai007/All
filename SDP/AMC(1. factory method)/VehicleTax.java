public class VehicleTax implements TaxCalculator
{
	private double taxAmount = 0.05;
	
	public double billCalculate(double amount)
	{
		return amount * taxAmount;
	}
  
	public double getTaxAmount(){
		
		return taxAmount;
		
	}
}