package ultramain.com.objectclass;

class Emp 
{
	private String name;
	private int age;
	
	public Emp(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	/*public boolean equals(Object obj)
	{
		System.out.println(obj);
		return true;		
	}*/
	
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj == null || this.getClass()!= obj.getClass())
		{
			return false;
		}
		Emp emp = (Emp)obj;
		return  this.name.equals(getName()) && this.age == emp.age;

	}
}

public class EqualMethod 
{
	public static void main(String args[])
	{		
		Emp e1 = new Emp("Divya",21);
		Emp e2 = new Emp("Mahesh",20);
		Emp e3 = new Emp("Divya",21);
		
		System.out.println(e1.equals(e3));	
		System.out.println(e1==e3);

		
		/*System.out.println("e1:"+ e1);		
		System.out.println("e2:"+ e2);		
		System.out.println("e3:"+ e3);	*/	

	}
}
