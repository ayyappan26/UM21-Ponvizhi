package ultramain.com.chaining;
public class CarThis4
{
	int i;
	String name;
	CarThis4()
	{
		System.out.println("This is default");
	}
	CarThis4(int i)
	{
		this();
		this.i = i;
		System.out.println(i);

	}
	CarThis4(int i,String name)
	{
		this(7);
		this.i = i;
		this.name = name;
		System.out.println("This is default2");

	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(i);
	}
	public static void main(String args[])
	{
		//CarThis4 ob = new CarThis4();
		CarThis4 ob1 = new CarThis4(2);
		CarThis4 ob3 = new CarThis4(3,"divya");
		ob3.display();
		ob1.display();


	}
}