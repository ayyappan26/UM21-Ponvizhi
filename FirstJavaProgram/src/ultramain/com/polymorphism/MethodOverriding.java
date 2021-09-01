package ultramain.com.polymorphism;
class B
{
public void display()
	{
		System.out.println("This is parent class");
	}
}

public class MethodOverriding extends B
{
	public void display(){
		//super.display(); if you need parent class method ,add super keyword
		System.out.println("This is child class");
	}
	public static void main(String args[])
	{
		MethodOverriding obj = new MethodOverriding();
		obj.display();
	}
}
