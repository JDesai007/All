import java.util.*;
class MainTaxCalculator{
	
	public static void main(String[]args)
	{
		TaxCalculator t;
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do
		{
			System.out.println("1.PropertyTax");
			System.out.println("2.WaterTax");
			System.out.println("3.EducationTax");
			System.out.println("4.ProfessionalTax");
			System.out.println("5.VehicleTax");
			System.out.println("6.Exit");
			System.out.println("choice the num");
		
			ch=sc.nextInt();
			if(ch==6)
				break;
		
			t=TaxCalculatorFactory.getTaxCalculator(ch);
			
			System.out.print("Enter Amount: ");
			
			System.out.println("Tax: "+ t.billCalculate(sc.nextDouble()));
		
		}
		while(true);
		
	}
	

}