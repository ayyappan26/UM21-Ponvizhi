package ultramain.com.exceptionhandling;

import java.io.*;
import java.util.Scanner;
public class Readable
{
	public static void main(String args[])
	{
		try
		{
			File myFile = new File("D:\\ULTRAMAIN\\Softwares\\Filef1.txt");
			Scanner myScanner = new Scanner(myFile);
			while(myScanner.hasNextLine())
			{
				String data = myScanner.nextLine();
				System.out.println(data);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}