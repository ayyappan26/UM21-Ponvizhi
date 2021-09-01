package ultramain.com.chaining;

public class CarThis9 
{
	int n = 10;
	CarThis9()
	{
		CarThis10 ob1 = new CarThis10(this);
		ob1.display();
	}
	public static void main(String args[])
	{
		CarThis9 ob3 = new CarThis9();
	}
}
