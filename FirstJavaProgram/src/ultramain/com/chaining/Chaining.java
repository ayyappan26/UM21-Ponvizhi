package ultramain.com.chaining;

class sup
{
	int i = 10;
	 sup(int a)
	{
		System.out.println(a);
	}
}
class sub extends sup
{
	double d = 9.88;
	sub()
	{
		super(32);
		System.out.println("Child class");
	}
}

public class Chaining
{
	public static void main(String args[])
	{
		sub ob = new sub();
		System.out.println(ob.i);
		System.out.println(ob.d);

	}
}