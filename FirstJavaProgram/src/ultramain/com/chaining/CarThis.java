package ultramain.com.chaining;


public class CarThis
{
	private int number;
	private String model;
	private String fuel;
	
	CarThis(int number, String model, String fuel)
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
		CarThis user1 = new CarThis(1234,"HUNDA","PETROL");
		user1.display();
		
	}

}
