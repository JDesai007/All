public class TaxCalculatorFactory {
  
  public static TaxCalculator getTaxCalculator(int i)
  {
	  switch(i)
		{
		case 1:
		return  new PropertyTax();
		
		case 2:
		return new WaterTax();
		
		case 3:
		return new EducationTax();
		
		case 4:
		return new ProfessionalTax();
		
		case 5:
		return new VehicleTax(); 
		
		default :
			return null;
		}
  }
}