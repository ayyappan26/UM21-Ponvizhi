package ultramain.com.polymorphism;

public class MethodOverloading 
{
	int age;
	String name;
	String place;
	public void display()
	{
		System.out.println("First method-Default");
	}
	public void display(int age)
	{
		System.out.println("Second method-Age:"+ age);
	}
	public void display(int age,String name)
	{
		System.out.println("Third method-Age:"+ age +" "+ "Name:"+ name);
	}
	public void display(int age,String name,String place)
	{
		System.out.println("Fourth method-Age:"+ age +" "+ "Name:"+ name +" "+ "Place:"+ place);
	}
	
	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(21);
		obj.display(21,"Ponvizhi");
		obj.display(21,"Ponvizhi","Harur");

	}
}
