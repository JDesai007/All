import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	
		PropertyTax pt;
		WaterTax wt;
		AbstractFactory af;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the corporate");
		System.out.println("1.AMC");
		System.out.println("2.VMC");
		System.out.println("Enter your corporate :");
		int ch=sc.nextInt();
		af=AbstractFactory.getCorporate(ch);
		System.out.println("Choose the tax");
		System.out.println("1.propertytax");
		System.out.println("2.watertax");
		System.out.println("Enter your choice :");
		int ch2=sc.nextInt();
		System.out.println("Enter amount :");
		double amount=sc.nextDouble();
		if(ch2==1)
		{
			pt=af.getTaxP();
			System.out.println("Your Tax amount is : " +pt.propertyTax(amount));
		}
		else if(ch2==2)
		{
			wt=af.getTaxW();
			System.out.println("Your Tax amount is : " +wt.waterTax(amount));
		}	
				
	}
}