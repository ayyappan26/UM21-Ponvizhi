package ponvizhi.com;





public class SecondProgram 
{
	public static void main(String args[])
	{
		System.out.println("Starting to main");
		Car.greet("welcome");
		System.out.println("Ending to main");
		SecondProgram.sleep();
	}
	public static void sleep()
	{
		System.out.println("Starting to sleep");
		//return false;
	}
}
class Car
{
	public static void greet(String argument)
	{
		System.out.println(argument);

	}
}


