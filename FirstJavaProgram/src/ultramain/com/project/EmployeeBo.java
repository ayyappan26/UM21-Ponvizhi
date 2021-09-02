package ultramain.com.project;


import java.util.Scanner;
import ultramain.com.project.EmployeeDto;

public class EmployeeBo
{
	public void addEmployees(EmployeeDto emp)
	{
		emp.getFirst_name();
		emp.getLast_name();
		emp.getSalary();
		emp.getEmployeeId();
	}
	
	public void viweEmployees(EmployeeDto emp)
	{
		System.out.println("Employee First Name:"+ emp.getFirst_name());
		System.out.println("Employee Last Name:"+ emp.getFirst_name());
		System.out.println("Employee Salary:"+ emp.getSalary());
		System.out.println("Employee EmployeeId:"+ emp.getEmployeeId());
	}
	public void editEmployees()
	{
		
	}
	public static void main(String args[])
	{
		//List<EmployeeDto> emp = new ArrayList<>();
		EmployeeDto emp = new EmployeeDto();
		EmployeeBo bo = new EmployeeBo();
		//List<EmployeeBo> bo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of employees you want to add:");
		int empNo = sc.nextInt();
		for(int i=0;i<empNo;i++)
		{
			System.out.println("Enter Employee First Name: ");
			emp.setFirst_name(sc.next());
			System.out.println("Enter Employee Last Name:");
			emp.setLast_name(sc.next());
			System.out.println("Enter Employee Salary");
			emp.setSalary(sc.nextFloat());
			System.out.println("Enter Employee Id");
			emp.setEmployeeId(sc.nextInt());
		}
		bo.addEmployees(emp);
		bo.viweEmployees(emp);
	}
}
