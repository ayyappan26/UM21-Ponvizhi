package ultramain.com.interfacee;
interface Bird
{
	public void fly();
}
interface Insect
{
	public void move();
}
 interface Example extends Bird,Insect 
{
	 public void eat();
}
 class Result implements Example
 {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Birds are flying");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Insects are moving");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("All Birds and animals are eating");
		
	}
	 
 }
 
 public class Example34 
 {
	 public static void main(String args[])
	 {
		 Bird b1 = new Result();
		 b1.fly();
		 Insect i1 = new Result();
		 i1.move();
		 Result r1 = new Result();
		 r1.eat();
	 }
 }
