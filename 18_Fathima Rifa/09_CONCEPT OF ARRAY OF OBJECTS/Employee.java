package oop;

import java.util.Scanner;

public class Employee {
	int eno,esalary;
	String ename;
	public Employee(){}
	public Employee(int no,int sal,String name) {
		eno=no;
		esalary=sal;
		ename=name;
	}
	public void showData(){
		System.out.print("Empid ="+eno+""+"name ="+ename+""+"salary="+esalary);
		System.out.println();                         
	
	}
	public static void main(String[] args) {
		
		System.out.println("enter no.of employee:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter employee details one by one");
		Employee employee[]=new Employee[n];
		Scanner scemp = new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++) {
		System.out.println("Enter "+ i +"employee details");
		System.out.println("Enter employee id(integer):");
		eid = scemp.nextInt();
		System.out.println("Enter employee name(String):");
		String name = scemp.next();
		enam=new String(name);
		System.out.println("enter employee salary(integer):");
		esal=scemp.nextInt();
		Employee emp=new Employee(eid,esal,enam);
		employee [i]=emp;
		scemp.close();
		}
		
		System.out.println("Employee one :\n");
		for(Employee y:employee)
			y.showData();
		System.out.println("Enter employee number to search :");
		int semp =sc.nextInt();
		boolean found = false;
		for(Employee d : employee) {
			if(semp == d.eno) {
				found=true;
				System.out.println("Employee found");
				d.showData();
				break;
			}
		}
		if(!found)
			System.out.println("Employee not found...");
		
		sc.close();
		
	}
}


