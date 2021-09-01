package ultramain.com.typecasting;

public class ExplicitConversion 
{
	public static void main(String args[])
	{
		double d = 300.99;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		
		System.out.println("Double:"+ d);
		System.out.println("Float:"+ f);
		System.out.println("Long:"+ l);
		System.out.println("Int:"+ i);
		System.out.println("Short:"+ s);
		System.out.println("Byte:"+ b);
	}
}
