package ultramain.com.chaining;


class Test
{
	private int number;
	private String model;
	private String fuel;
	
	Test(int number, String model, String fuel)
	{
		this.number = number;
		this.model = model;
		this.fuel = fuel;
	}
	
	public void display()
	{
		System.out.println(number);
		System.out.println(model);
		System.out.println(fuel);
	}
	
	public static void main(String args[])
	{
		Test user1 = new Test(1234,"HUNDA","PETROL");
		user1.display();
		
	}

}
