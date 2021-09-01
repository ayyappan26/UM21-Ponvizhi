package ultramain.com.superkeyword;

class A1
{
	String name;
	String place;
	int age;
	A1()
	{
		System.out.println("This is default ");
	}
	A1(String name)
	{
		this.name = name;
	}
	A1(String name,String place,int age)
	{
		this(name);
		this.place = place;
		this.age = age;
	}
}

public class SuperConstructor extends A1
{
	String fatherName;
	String motherName;
	
	SuperConstructor(String fatherName,String motherName)
	{
		super("Ponvizhi","Harur",21);
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	
	void display()
	{
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Place:"+ place);
		System.out.println("Name:"+ fatherName);
		System.out.println("Name:"+ motherName);
		
	}
	
	public static void main(String args[])
	{
		SuperConstructor obj = new SuperConstructor("Ponnusamy","Poongodi");
		obj.display();
	}
}
