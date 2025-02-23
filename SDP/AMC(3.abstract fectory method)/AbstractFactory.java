public interface AbstractFactory
{
	public static AbstractFactory  getCorporate(int i)
	{
		switch(i)
		{
			case 1:
				return new AMCFactory();
			case 2:
				return new VMCFactory();
			default:
				return null;
		}
	}
	public PropertyTax getTaxP();
	public WaterTax getTaxW();
}
