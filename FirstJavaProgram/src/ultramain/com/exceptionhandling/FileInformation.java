package ultramain.com.exceptionhandling;

import java.io.File;

public class FileInformation 
{
	public static void main(String args[])
	{
		File myobj1 = new File("D:\\ULTRAMAIN\\Softwares\\Filef1.txt");
		if(myobj1.exists())
		{
			System.out.println("File name:"+ myobj1.getName());
			System.out.println("Absolute Path:"+ myobj1.getAbsolutePath());
			System.out.println("Writable:"+ myobj1.canWrite());
			System.out.println("Readable:"+ myobj1.canRead());
			System.out.println("File size in bytes:"+ myobj1.length());
		}
		else
		{
			System.out.println("File does not exits");
		}
	}
}
