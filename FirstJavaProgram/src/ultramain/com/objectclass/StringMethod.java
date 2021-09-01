package ultramain.com.objectclass;

class College
{
	String name;
	int contno;
	
	public College(String name, int contno)
	{
		this.name = name;
		this.contno = contno;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", contno=" + contno + "]";
	}
	
	
}
public class StringMethod 
{
	public static void main(String args[])
	{
		College obj1 = new College("KSR",23456);
		System.out.println(obj1.toString());
	}
}
