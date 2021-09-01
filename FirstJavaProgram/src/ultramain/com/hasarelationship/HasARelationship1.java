package ultramain.com.hasarelationship;

import java.util.Scanner;

class Student1
{
	String rollNo;
	String name;
	String dept;
	
	Student1(String rollNo,String name,String dept)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}
	
	public String getRollno()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void StudentDetails()
	{
		System.out.println("Name:"+ name);
		System.out.println("RoLLnO:"+ rollNo);
		System.out.println("Dep:"+ dept);
	}
}

class proffesor
{
	public void proffesorAccount(Student1 s)
	{
		System.out.println("Enter Student roll no:");
		Scanner sc = new Scanner(System.in);
		String stdRollNo = sc.next();
		if(stdRollNo.equals(s.rollNo))
		{
			s.StudentDetails();
		}
		else
		{
			System.out.println(" ohh NO,Roll no doesn exit");
		}
	}
	
}

public class HasARelationship1 
{
	public static void main(String args[])
	{
		Student1 s = new Student1("1714157CSE","Ponvizhi","CSE");
		proffesor p = new proffesor();
		p.proffesorAccount(s);
		
	}
}
