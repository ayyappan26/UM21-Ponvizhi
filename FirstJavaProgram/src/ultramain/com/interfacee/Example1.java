package ultramain.com.interfacee;


interface Example3
{
	int i = 20;
	public void RateOfIntrest();

}
class Hdfc implements Example3
{
	public void RateOfIntrest()
	{
		int i = 21;
		System.out.println("7% intrest..."+ i);
	}
}
class StateBank implements Example3
{
	public void RateOfIntrest()
	{
		System.out.println("8% intrest..."+ i);
	}
}
public class Example1  
{
	public static void main(String args[])
	{
		Example3 user1 = new Hdfc();
		user1.RateOfIntrest();
		Example3 user2 = new StateBank();
		user2.RateOfIntrest();
	}
}
