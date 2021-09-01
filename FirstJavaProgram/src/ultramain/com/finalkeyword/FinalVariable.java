package ultramain.com.finalkeyword;

public class FinalVariable 
{
	public static void main(String args[])
	{
		final int i = 10;
		for(int a = 0;a<i;a++)
		{
			System.out.println(i);
			i++; // we cannot increment 
		}
	}
}
