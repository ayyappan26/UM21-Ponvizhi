package ultramain.com.typecasting;

class Casting
{
	public void test1()
	{
		System.out.println("This is test1 method");
	}
}
class Casting1 extends Casting
{
	public void test2()
	{
		System.out.println("This is test2 method");
	}
}
public class ObjectCasting extends Casting1
{
	public void test2()
	{
		System.out.println("This is test2_1 method");
	}
	public void test3()
	{
		System.out.println("This is test2 method");
	}
	/* public void Test1()
	 * {
	 * System.out.println("This is test1 method in child class);
	 * }
	 */
	public static void main(String args[])
	{
		Casting ob1 = new ObjectCasting();
		ob1.test1();
		System.out.println("_________");
		//(  (ObjectCasting)  ob1).  test2(); //object typecasting
		//(  (ObjectCasting)  ob1).  test1(); 
		
		ObjectCasting ob2 = new ObjectCasting();
		Casting1 ob3 = (Casting1)ob2;
		ob3.test1();
		ob3.test2(); // overriding
		//ob3.test3() cants access test3()
		

	}
}
