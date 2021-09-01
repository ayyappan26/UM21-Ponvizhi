package ultramain.com.exceptionhandling;


public class UncheckedException1
{
	public static void main(String args[])
	{
		int a[] = new int[4];
		try
		{
			for(int j1 =0;j1<=4;j1++)
			{
				a[j1] = j1+1;
			}
			for(int value : a) // for each loop
			{
				System.out.println(value);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum number of values ,"+e);
		}
	}
}
