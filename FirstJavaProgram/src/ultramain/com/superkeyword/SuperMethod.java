package ultramain.com.superkeyword;

class ParentClass
{
	public void display()
	{
		System.out.println("This is parent method");
	}
}

public class SuperMethod extends ParentClass 
{
	public void display()
	{
		System.out.println("This is child class");
	}
	
	void work()
	{
		super.display();
		display();
	}
	public static void main(String args[])
	{
		SuperMethod obj = new SuperMethod();
		obj.work();
	}
}
