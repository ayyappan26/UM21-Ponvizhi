package ultramain.com.chaining;

public class CarThis8
{
	CarThis8()
	{
		System.out.println("This is first method");
	}
	CarThis8(CarThis8 ob)
	{
		System.out.println("This is second method");
		System.out.println(ob);
	}
	
	void m2()
	{
		CarThis8 ob = new CarThis8(this);
		
	}
	
	public static void main(String args[])
	{
		CarThis8 ob1 = new CarThis8();
		//ob1.m1(ob1);
		//ob1.m1(this); we cannot use this in static method
		ob1.m2();
		
	}
}