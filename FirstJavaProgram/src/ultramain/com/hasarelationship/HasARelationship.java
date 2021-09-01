package ultramain.com.hasarelationship;

import java.util.Scanner;

class Parents
{
	private String fatherName;
	private String motherName;
	
	
	
	public String getFatherName() {
		return fatherName;
	}



	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}



	public String getMotherName() {
		return motherName;
	}



	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
}

class Address
{
	private String nativePlace;
	private String post;
	private String talk;
	private String district;
	

public String getNativePlace() {
		return nativePlace;
	}


	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public String getTalk() {
		return talk;
	}


	public void setTalk(String talk) {
		this.talk = talk;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}
}

class Student
{
	private String name;
	private String dept;
		
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
}

class DiplayStudentDetail
{
	public void setStudentDetail(Parents p,Address a,Student s)
	{
		System.out.println("Enter Student name:");
		Scanner sc = new Scanner(System.in);
		s.setName(sc.next());
		System.out.println("Enter Student dept:");
		s.setDept(sc.next());
		System.out.println("Enter Student Father name:");
		p.setFatherName(sc.next());
		System.out.println("Enter Student Mother name:");
		p.setMotherName(sc.next());
		System.out.println("Enter Student Address:");
		a.setNativePlace(sc.next());
		a.setPost(sc.next());
		a.setTalk(sc.next());
		a.setDistrict(sc.next());
	}
	public void displayStudentDetail(Parents p,Address a,Student s)
	{
		System.out.println("Here student details:");
		System.out.println(s.getName());
		System.out.println(s.getDept());
		System.out.println(p.getFatherName());
		System.out.println(p.getMotherName());
		System.out.println(a.getNativePlace());
		System.out.println(a.getPost());
		System.out.println(a.getTalk());
		System.out.println(a.getDistrict());

	}
}

public class HasARelationship 
{
	public static void main(String args[])
	{
		Parents p = new Parents();
		Address a = new Address();
		Student s = new Student();
		DiplayStudentDetail d = new DiplayStudentDetail();
		d.setStudentDetail(p,a,s);	
		d.displayStudentDetail(p, a, s);
	}
}
