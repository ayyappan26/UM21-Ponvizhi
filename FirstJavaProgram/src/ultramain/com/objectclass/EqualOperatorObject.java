package ultramain.com.objectclass;



public class EqualOperatorObject
{
	public static void main(String args[])
	{
		String s1 = new String("DIVYA");
		String s2 = new String("PONVIZHI");
		String s3 = new String("DIVYA");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
