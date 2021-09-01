package ultramain.com.abstraction;

abstract class Phone
{
	public abstract void version1();
	public abstract void version2();
	public abstract void version3();
	public void display()
	{
		System.out.println("This phone didnt ready yet!");
	}
	
}
abstract class Phone1 extends Phone
{
	public void display1()
	{
		System.out.println("Yeah here we can created first version");
	}
	public void version1()
	{
		System.out.println("You can make call only");
	}
	public abstract void version2();
	public abstract void version3();
}

abstract class Phone2 extends Phone1
{
	public void display2()
	{
		System.out.println("Yeah here we can created second version");
	}
	public void version2()
	{
		System.out.println("You can use network");
	}
	public abstract void version3();
}

class Phone3 extends Phone2
{
	public void display3()
	{
		System.out.println("Yeah here we can created Third version");
	}
	public void version3()
	{
		System.out.println("You can get more data");
	}
}

class Display
{
	public void displayPhone(Phone3 ph)
	{
		ph.display();
		System.out.println("_____________________");
	}
	public void displayPhone1(Phone3 ph)
	{
		ph.display1();
		ph.version1();
		System.out.println("_____________________");
	}
	public void displayPhone2(Phone2 ph)
	{
		ph.display2();
		ph.version2();
		System.out.println("_____________________");
	}
	public void displayPhone3(Phone3 ph)
	{
		ph.display3();
		ph.version3();
		System.out.println("_____________________");
	}
}

public class FirstExample
{
	public static void main(String args[])
	{
		Phone3 ph = new Phone3();
		Display d1 = new Display();
		d1.displayPhone(ph);
		d1.displayPhone1(ph);
		d1.displayPhone2(ph);
		d1.displayPhone3(ph);
	}
}
