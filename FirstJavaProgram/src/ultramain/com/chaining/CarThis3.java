package ultramain.com.chaining;

public class CarThis3
{
	
	public void display()
	{
		System.out.println("FIRST");
	}
	public void show()
	{
		//this.display();
		System.out.println("SECOND");
	}
	public void show2()
	{
		//this.show();
		//this.display();
		System.out.println("THIRD");
		this.display();
	}
	public static void main(String args[])
	{
		CarThis3 ob = new CarThis3();
		ob.show2();
	}
}