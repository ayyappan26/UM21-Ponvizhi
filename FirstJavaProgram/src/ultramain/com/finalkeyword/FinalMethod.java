package ultramain.com.finalkeyword;

class B
{
	final public void display()
	{
		System.out.println("First");
	}
}
public class FinalMethod extends B
{
	public void display() // here we cannot override ,because in parent class the method is final.
	{
		System.out.println("second");
	}
	public static void main(String args[])
	{
		FinalMethod ob = new FinalMethod();
		ob.display();
	}
}