package ultramain.com.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,j,k=0;
		i = 8;
		j = Integer.parseInt(br.readLine());
		
		try
		{
			k = i/j;
		}
		catch(Exception e) //checked
		{
			System.out.println(e);
		}
		System.out.println(k);
	}
}
