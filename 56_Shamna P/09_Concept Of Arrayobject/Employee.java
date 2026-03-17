package OOPSLAB;

import java.util.Scanner;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee(int no,int sal,String name) {
		eNo=no;
		eName=name;
		eSalary=sal;}
	public void showData() {
		System.out.println("EmpId= "+eNo+" "+"Name "+eName+" "+"Salary"+eSalary);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Enter no. of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter employee details one by one: ");
		Employee employees[]=new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+"employee details: ");
			System.out.println("Enter employee id(integer): ");
			eid=scemp.nextInt();
			System.out.println("Enter employee name: ");
			String name=scemp.next();
			enam=new String(name);
			System.out.println("Enter employee Salary(integer): ");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;
			sc.close();
			scemp.close();
		}
		System.out.println("Employees are: \n");
		for(Employee em : employees)
			em.showData();
		System.out.println("Enter employee nmber to search: ");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee emp:employees) {
			if(semp==emp.eNo) {
					found=true;
					System.out.println("employee found");
					emp.showData();
					break;
				}
			}
			if(!found)
				System.out.println("not found");
		}
	
	}

