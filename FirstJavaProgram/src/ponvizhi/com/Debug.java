package ponvizhi.com;

class Test
{
	//public  void display()

	public static void display()
	{
		System.out.println("First method");
	}
	
	
}
public class Debug extends Test
{
	//public  void display()
	public static void display()
	{
		System.out.println("second method");
	}
	public static void main(String args[])
	{
		Test obj = new Test();
		Debug obj2 = new Debug();
		Test obj21 = new Debug();
		//Debug obj22 = new Test(); only parent to child 

		obj.display();
		obj2.display();
		obj21.display();
		//obj22.display();

	}

}

