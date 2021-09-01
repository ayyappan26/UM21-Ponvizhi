package ultramain.com.exceptionhandling;

public class UncheckedException
{
	public static void main(String args[])
	{
		int i,j,k=0;
		i = 8;
		j = 0;
		try
		{
			k = i/j;
		}
		catch(ArithmeticException e) // unchecked exception
		{
			System.out.println("Cannot divide by zero,"+ e);
		}
		System.out.println(k);
	}
}
