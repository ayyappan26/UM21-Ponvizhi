package ultramain.com.string;

public class ProblemStatement2 
{
	/*
	 * StringBuffer 
	 */
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("This is StringBuffer");
		sb.append(" This is a sample Program");
		System.out.println(sb);
		sb.insert(21,"Object");
		System.out.println(sb);
		
		sb.replace(14, 20, "Builder");
		System.out.println(sb);
		System.out.println(sb.reverse());

	}
}
