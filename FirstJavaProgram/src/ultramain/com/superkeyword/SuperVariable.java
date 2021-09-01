package ultramain.com.superkeyword;
class A
{
	int i = 10;
	
}

public class SuperVariable extends A
{
	int i =20;
	void display()
	{
		System.out.println(super.i);
	}
	
	public static void main(String args[])
	{
		SuperVariable obj = new SuperVariable();
		obj.display();
	}
}