package ultramain.com.hasarelationship;

import java.util.Scanner;

class Children
{
	private String name;
	private String dept;
	private int rollno;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}

class Father
{
	public Children getMyChildrenDetails(Children c)
	{
		Children mychildren = null;
		if(c == null)
		{
			mychildren = new Children();
		}
		else
		{
			mychildren = c;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		mychildren.setName(sc.next());
		System.out.println("Enter Dept:");
		mychildren.setDept(sc.next());
		System.out.println("Enter RollNo:");
		mychildren.setRollno(sc.nextInt());
		return mychildren;
	}
	
	public void displayMyChildrenDetails(Children c)
	{
		if(c!= null)
		{
			System.out.println("And HERE your details are:");
			System.out.println(c.getName());
			System.out.println(c.getRollno());
			System.out.println(c.getDept());

		}
	}
}

public class HasARelationship2 
{
	public static void main(String args[])
	{
		Children mychildren = null;
		Father f = new Father();
		mychildren = f.getMyChildrenDetails(mychildren);
		f.displayMyChildrenDetails(mychildren);
	}
}
