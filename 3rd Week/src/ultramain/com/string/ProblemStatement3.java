package ultramain.com.string;

public class ProblemStatement3
{
	/*
	 * StringBuilder 
	 */
	public static void main(String args[])
	{
		String s = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		StringBuilder sb = new StringBuilder(s);
		String[] stringarray = sb.split("\\");
		//iterate over string array  
		for(int i=0; i< stringarray.length; i++)  
		{  
		//prints the tokens  
		System.out.println(stringarray[i]);  

	}
}
