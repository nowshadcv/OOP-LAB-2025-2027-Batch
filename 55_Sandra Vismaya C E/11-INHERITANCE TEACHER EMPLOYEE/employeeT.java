package OOPLAB;

import java.util.Scanner;

class Employee{
	int empid;
	String name;
	Float salary;
	String address;
	
	Employee(int empid,String name,Float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}

class Teacher extends Employee{
	String department;
	String subject;
	
	Teacher(int empid,String name,Float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	
public void display() {
	
	System.out.println("\n Teacher Details :");
	
	System.out.println("ID :" + empid);
	System.out.println("Name :" + name);
	System.out.println("Salary :" + salary);
	System.out.println("Address :" + address);
	System.out.println("Department :" + department);
	System.out.println("Subject :" + subject);
	
	}
}

class TeacherArrayObjects{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of teachers :");
		int n=sc.nextInt();
		
		Teacher [] t=new Teacher[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Teacher "+(i+1)+ " Details :");
			
			System.out.print("Enter ID :" );
			int id=sc.nextInt();
			
			System.out.print("Enter Name :" );
			String name=sc.next();
			
			System.out.print("Enter Salary :" );
			Float salary=sc.nextFloat();
			
			System.out.print("Enter Address :" );
			String address=sc.next();
			
			System.out.print("Enter Department :" );
			String department=sc.next();
			
			System.out.print("Enter Subject :" );
			String subject=sc.next();
			
			t[i]=new Teacher(id,name,salary,address,department,subject);
			
			for(i=0;i<n;i++)
			{
				t[i].display();
				sc.close();
			}
		}
	}
}












