package ultramain.com.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.println("Enter a number");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		
		int n = Integer.parseInt(b.readLine());
		
		System.out.println(n);
	}
}
