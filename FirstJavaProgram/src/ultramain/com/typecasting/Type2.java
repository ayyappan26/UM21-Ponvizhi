package ultramain.com.typecasting;

class GrandFather
{
	public void eat()
	{
		System.out.println("G'Father is eating");
	}
	public void rest()
	{
		System.out.println("GrandFather is resting ");
	}
}
class Father extends GrandFather
{
	public void sleep()
	{
		System.out.println("Father is sleeping");
	}
	public void earn()
	{
		System.out.println("Dad is earning");
	}
}
class Son extends Father
{
	public void dance()
	{
		System.out.println("Son is dancing");
	}
	public void eat()
	{
		System.out.println("Son is eating");
	}
	public void college()
	{
		System.out.println("son is going to college ");
	}
}

class Daughter extends Father
{
	public void eat()
	{
		System.out.println("Daughter is eating");
	}
	public void school()
	{
		System.out.println("Daughter is going to school");
	}
}
class Display
{
	public void displaySon(Son myson)
	{
		myson.college();
		myson.dance();
		myson.eat();
		myson.earn();
		myson.rest();
	}
	public void displayDaughter(Daughter mydaughter)
	{
		mydaughter.earn();
		mydaughter.eat();
		mydaughter.rest();
		mydaughter.school();
		mydaughter.sleep();
	}
}
public class Type2 
{
	public static void main(String[] args) 
	{
		Son myson = new Son();
		Daughter mydaughter = new Daughter();
		Display d1 = new Display();
		d1.displaySon(myson);
		System.out.println("_____________________");
		d1.displayDaughter(mydaughter);
	}
}
