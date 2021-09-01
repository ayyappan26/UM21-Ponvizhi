package ultramain.com.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile 
{
	public static void main(String args[])
	{
		try
		{
			FileWriter myWriter = new FileWriter("D:\\ULTRAMAIN\\Softwares\\Filef1.txt");
			myWriter.write("Hai Ponvizhi");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("File doent exits");
		}
	}
}
