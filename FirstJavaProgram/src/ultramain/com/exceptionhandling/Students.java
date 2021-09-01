package ultramain.com.exceptionhandling;
import java.io.*;

public class Students 
{
	public static void main(String args[]) throws IOException
	{
		File myFile = new File("D:\\ULTRAMAIN\\Softwares\\Filef1.txt");
			BufferedReader b = null;
			try
			{
				b = new BufferedReader(new FileReader(myFile));
				String str = b.readLine();
				while(str!=null)
				{
					System.out.println(str);
					str = b.readLine();
				}
			}
			catch(FileNotFoundException e)
			{
					System.out.println("File not found");
			}
			catch(IOException e)
			{
				System.out.println("found error");
			}
	}
}