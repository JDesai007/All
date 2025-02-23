public class ProfessionalTax implements TaxCalculator
{
	private double taxAmount = 0.03;
	
	public double billCalculate(double amount)
	{
		return amount * taxAmount;
	}
  
	public double getTaxAmount(){
		
		return taxAmount;
		
	}
}