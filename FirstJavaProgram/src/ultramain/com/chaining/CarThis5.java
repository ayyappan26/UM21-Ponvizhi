package ultramain.com.chaining;

public class CarThis5
{
	void display1(CarThis5 ob)
	{
		System.out.println("This is first method");
	}
	void display2(CarThis5 ob)
	{
		System.out.println("This is second method");
	}
	void display3()
	{
		System.out.println("This is third method");
		this.display1(this);
		this.display2(this);
		
	}
	public static void main(String args[])
	{
		CarThis5 ob = new CarThis5();
		ob.display3();
		//ob1.display1();
		
	}
}