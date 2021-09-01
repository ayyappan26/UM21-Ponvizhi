package ultramain.com.typecasting;

class ClassA
{
	public void main()
	{
		System.out.println("This method has classA");
	}
}
class ClassB extends ClassA
{
	public void main1()
	{
		System.out.println("This method has classB");
	}
}
class ClassC extends ClassB
{
	public void main1()
	{
		System.out.println("This method has classC");
	}
	public void main2()
	{
		System.out.println("This method has classC");
	}
}
class DisplayValue
{
	public static void display(ClassA a)
	{
		if(a instanceof ClassC)
		{
			ClassC c = (ClassC)a; // here we do a downcasting 
			c.main();
			c.main1();
			c.main2();
			
		}
	}
}
public class DownCasting 
{
	public static void main(String args[])
	{
		
		ClassA a = new ClassC();
		DisplayValue.display(a); 
		System.out.println("_____"); 

		/*ClassC a = new ClassC();
		a.main2();
		System.out.println("_____________");
		
				
		ClassB b = (ClassB)a; // Here we do upcasting for(sub class ->ClassC and super class-> ClassB) so we cannot access the method which is ClassC ,but we can override and also we can access method from ClassA because ClassB is extend.
		b.main1();*/
		
		
		

	}
}