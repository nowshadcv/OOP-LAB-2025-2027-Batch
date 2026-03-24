package mca_s2_27;
import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age)
	{
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class Employee extends Person
{
	String empid,company_name,qualification;
	float salary;
	Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary)
	{
		super(name,gender,address,age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
}

class Teachers extends Employee
{
	String subject,department,Teachersid;
	Teachers(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String Teachersid)
	{
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject = subject;
		this.department = department;
		this.Teachersid = Teachersid;
	}



	public void display()
	{
		System.out.println("Teachers id :"+empid);
		System.out.println("Teachers name :"+name);
		System.out.println("Teachers gender :"+gender);
		System.out.println("Teachers address :"+address);
		System.out.println("Teachers age :"+age);
		System.out.println("Teachers company name :"+company_name);
		System.out.println("Teachers qualification :"+qualification);
		System.out.println("Teachers salary :"+salary);
		System.out.println("Teachers Teachers id :"+Teachersid);
		System.out.println("Teachers subject :"+subject);
		System.out.println("Teachers department :"+department);
	}
}


public class Teachersobjects
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Teachers:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Teachers details one by one!");
		Teachers Teachers[] = new Teachers[n];
		Scanner sct = new Scanner(System.in);
		String tid;
		int age;
		String name,company_name,qualification,gender,address,department,subject,empid;
		float salary;
		
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter the details of Teachers"+(i+1));
			System.out.println("Enter the Teachers id:");
			tid = sct.next();
			System.out.println("Enter the employee id of the Teachers"+(i+1));
			empid = sct.next();
			System.out.println("Enter the Teachers name:");
			name = sct.next();
			System.out.println("Enter the Teachers gender:");
			gender = sct.next();
			System.out.println("Enter the Teachers address:");
			address = sct.next();
			System.out.println("Enter the Teachers age:");
			age = sct.nextInt();
			System.out.println("Enter the Teachers company name:");
			company_name = sct.next();
			System.out.println("Enter the Teachers department name:");
			department = sct.next();
			System.out.println("Enter the Teachers qualification :");
			qualification = sct.next();
			System.out.println("Enter the Teachers subject :");
			subject = sct.next();
			System.out.println("Enter the Teachers salary:");
			salary = sct.nextFloat();
			
			Teachers t = new Teachers(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			Teachers[i] = t;
			
		}
		System.out.println("Teacherss are:\n");
		for(Teachers x:Teachers)
		{
			x.display();
			System.out.println("\n");
		}
		sc.close();
		sct.close();
	}
}