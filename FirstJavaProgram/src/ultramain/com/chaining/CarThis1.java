package ultramain.com.chaining;
public class CarThis1
{
	private int age;
	private long phnumber;
	private String name;

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(long l) {
		this.phnumber = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Name:"+ name );
		System.out.println("Age:"+ age);
		System.out.println("Phone number:"+ phnumber);
	}
	
	public static void main(String args[])
	{
		CarThis1 ob1 = new CarThis1();
		ob1.setAge(21);
		ob1.setName("Ponvizhi");
		ob1.setPhnumber(9791859896L);
		
		ob1.display();
		
	}
		
}

	