package ultramain.com.chaining;

public class CarThis6
{
	CarThis6 m1()
	{
		return this; // here this represents the current class instance
	}
	CarThis6 m3()
	{
		CarThis6 ob = new CarThis6();
		//return this;
		return(ob);
	}
	void m2()
	{
		System.out.println("Method:"+ this);
	}
	public static void main(String args[])
	{
		CarThis6 ob = new CarThis6();
		System.out.println("Return type:" +ob.m1());
		System.out.println("Static method:" +ob);
		ob.m2();
		System.out.println("Another Return type: "+ob.m3());
		
		//System.out.println(this); we cannot declare this in static method
	}
}