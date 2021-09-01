package ultramain.com.chaining;

public class CarThis7
{
	void m1(CarThis7 ob)
	{
		System.out.println("This is First method");
		System.out.println(ob);
	}
	
	void m2()
	{
		CarThis7 ob = new CarThis7();
		ob.m1(ob); // here first ob is reference variable and second ob is class type variable(argument)
		
		//or
		
		//this.m1(ob);
		//this.m1(this);
		//m1(ob);
	}
	
	public static void main(String args[])
	{
		CarThis7 ob1 = new CarThis7();
		//ob1.m1(ob1);
		//ob1.m1(this); we cannot use this in static method
		ob1.m2();
		
	}
}