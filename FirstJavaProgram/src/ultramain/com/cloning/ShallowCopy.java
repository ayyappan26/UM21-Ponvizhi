package ultramain.com.cloning;

class Address
{
	String hno;
	String sname;
	String city;
	public Address(String hno, String sname, String city) {
		super();
		this.hno = hno;
		this.sname = sname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
}
class Employee implements Cloneable
{
	String name;
	int id;
	Address address;
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		Employee e = (Employee)super.clone();
		return e;
		
	}


	public Employee(String name, int id,Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	
}
public class ShallowCopy 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Address a1 = new Address("1/133","Harur","Dharmapuri");
		Employee e1 = new Employee("ponvizhi",12345,a1);
		
		System.out.println(e1);
		System.out.println(e1.address);
		System.out.println(e1.hashCode());
		
		Employee e2 = e1.clone();
		System.out.println(e2);
		System.out.println(e2.address);
		System.out.println(e2.hashCode());
		
		System.out.println(e1.name == e2.name);
		System.out.println(e1.name.equals(e1.name));
		
	}
}
