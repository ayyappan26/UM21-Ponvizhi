package ultramain.com.interfacee;

interface Dog
{
	public void bark();
	/*dog()
	{ here we cannot use constructor in interface ,and also cant create object in interface;
		
	}*/
}
interface Lion
{
	public void roar();
}
class Animals implements Dog,Lion
{
	public void bark() 
	{
		System.out.println("Dog is barking");
	}
	public void roar() 
	{
		System.out.println("Lion is roaring");
	}
}
public class Example2 
{
	public static void main(String[] args)
	{
		Dog animal1 = new Animals();
		Lion animal2 = new Animals();
		animal1.bark();
		animal2.roar();
		
	}

}