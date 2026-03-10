package OOPLAB;

import java.util.Scanner;
 class Employee {
	int eNo, eSalary;
	String eName;
	public Employee (int no, int sal, String name)
	{
		eNo = no;
		eSalary = sal;
		eName = name;
	}
	public void ShowData ()
	{
		System.out.print("EmpId =" +eNo+ " " + "Name =" +eName+ " " + "Salary =" +eSalary);
		System.out.println ();
	}
}


public class EmpArrobjects 
{
	public static void main(String args[])
	{
		System.out.println("Enter number of Employee :");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Enter Employee details one by one");
		Employee employees [] = new Employee [n];
		Scanner scemp = new Scanner (System.in);
		int eid,esal;
		String ename;
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter"+i+"Employee details");
			System.out.println("Enter Employee id (integer):");
			eid = scemp.nextInt();
			System.out.println("Enter Employee name(String):");
			String nam = scemp.next();
			System.out.println("Enter Employee Salary(integer):");
			esal = scemp.nextInt();
			Employee emp = new Employee (eid,esal,nam);
			employees [i] = emp;
		}
		System.out.println("Employees are :\n");
		for (Employee y : employees)
			y.ShowData();
		System.out.println("Enter Employee number to search :");
		int semp = sc.nextInt();
		boolean found = false;
		for (Employee e : employees)
		{
			if(semp == e.eNo)
			{
				found = true;
				System.out.println("Employee found..");
				e.ShowData();
				break;
			}
		}
			if(! found)
				System.out.println("Employee not found..");
			sc.close();
			scemp.close();
		}
		
	}


