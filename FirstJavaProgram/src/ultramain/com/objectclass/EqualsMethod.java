package ultramain.com.objectclass;

public class EqualsMethod 
{
	public static void main(String args[])
	{
		String s1 = "Divya";
		String s2 = "PONVIZHI";
		String s3 = "Divya";
		int i1 = 2;
		int i2 = 2;
		int i3 = 6;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(i1==i2);
		//System.out.println(i1.equals(i2)); cant do in primitive data types

	}
}
