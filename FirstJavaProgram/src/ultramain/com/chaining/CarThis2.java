package ultramain.com.chaining;
public class CarThis2
{
	int i;
	
	public void setValue(int i)
	{
		this.i = i;
	}
	
	public void display()
	{
		System.out.println("Start");
		System.out.println(i);
		System.out.println("End");
	}
	public static void main(String args[])
	{
		CarThis2 ob = new CarThis2();
		ob.setValue(10);
		ob.display();
		
	}
}