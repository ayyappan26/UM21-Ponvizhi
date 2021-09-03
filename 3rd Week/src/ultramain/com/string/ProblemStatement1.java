package ultramain.com.string;

public class ProblemStatement1 
{
	/*
	 * String 
	 */
	public static void main(String args[])
	{
		String str = "Welcome to Java World";
		char s1 = str.charAt(5);
		System.out.println(s1);
		String str1 = "Welcome";
		System.out.println(str.compareToIgnoreCase(str1));
		String str2 = " Let us learn";
		System.out.println(str.concat(str2));
		System.out.println(str.replace('e', 'a'));
		String s2 = str.substring(4, 10);
		System.out.println(s2);
		System.out.println(str.toLowerCase());

	}
}
