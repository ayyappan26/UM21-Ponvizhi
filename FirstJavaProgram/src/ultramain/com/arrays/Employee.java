package ultramain.com.arrays;

import java.util.Scanner;

public class Employee 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  size");
		int size = sc.nextInt();
		System.out.println("Enter"+" "+ size + " Employee name");
		String s[] = new String[size];
		
		for(int i=0;i<size;i++)
		{
			s[i] = sc.next();
		}
		
		int age[] = new int[size];
		System.out.println("Enter age:");
		for(int a=0;a<size;a++)
		{
			age[a] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Employee name " + i + " " + s[i] + " "+ "Age is " + age[i]);
		}
	}
}
