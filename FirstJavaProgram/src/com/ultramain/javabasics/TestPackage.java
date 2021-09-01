package  com.ultramain.javabasics;
//import ponvizhi.com.SecondProgram;

public class TestPackage
{
	public static void main(String args[])
	{
		SomethingStatic c1 = new SomethingStatic();
		c1.display();
				
		SomethingStatic c2 = new SomethingStatic();
		c2.display();
		//SomethingStatic.display();
		//SomethingStatic.display();
		//System.out.println();
		
		

		
	}
}

class SomethingStatic
{
	 int a = 0;
	public   void display()
	{
		a++;
		System.out.println(a);
	}
}