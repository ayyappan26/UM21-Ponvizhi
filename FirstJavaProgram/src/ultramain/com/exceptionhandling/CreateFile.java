package ultramain.com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String args[])
	{
		try
		{
			File myObj = new File("D:\\ULTRAMAIN\\Softwares\\Filef1.txt");
			if(myObj.createNewFile())
			{
				System.out.println("File created:"+ myObj.getName());
			}
			else
			{
				System.out.println("File is already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			//e.printStackTrace();
		}
	}
}
