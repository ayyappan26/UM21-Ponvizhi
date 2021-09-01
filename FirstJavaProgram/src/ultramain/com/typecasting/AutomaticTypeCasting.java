package ultramain.com.typecasting;

public class AutomaticTypeCasting 
{
	public static void main(String args[])
	{
		byte b = 127;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println("Byte:" + b);
		System.out.println("Short:" + s);
		System.out.println("Int:" + i);
		System.out.println("Long:" + l);
		System.out.println("Float:" + f);
		System.out.println("Double:" + d);
	}
}
