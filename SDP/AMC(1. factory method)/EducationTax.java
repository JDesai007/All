class EducationTax implements TaxCalculator{

	private double taxAmount = 0.02;
	
	public double billCalculate(double amount)
	{
		return amount * taxAmount;
	}
  
	public double getTaxAmount(){
		
		return taxAmount;
		
	}
}