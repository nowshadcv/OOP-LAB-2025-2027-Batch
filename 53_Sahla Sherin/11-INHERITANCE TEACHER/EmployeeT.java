package OOPSLAB;
import java.util.Scanner;
class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}

class Teacher extends EmployeeT{
	String department,subjects;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subjects=subject;
	}
	public void display() {
		System.out.println("Teacher id: "+empid);
		System.out.println("Teacher name: "+name);
		System.out.println("Teacher salary: "+salary);
		System.out.println("Teacher address: "+address);
		System.out.println("Teacher department: "+department);
		System.out.println("Teacher subject: "+subjects);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of teachers: ");
		int n=sc.nextInt();
		Teacher teach[]=new Teacher[n];
		System.out.println("***Enter the Details of Teachers***");
		int tid;
		String name,address,department,subject;
		float salary;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+"teacher details:");
			System.out.println("Enter the teacher id: ");
			tid=sc.nextInt();
			System.out.println("Enter the teacher name: ");
			name=sc.next();
			System.out.println("Enter the teacher salary: ");
			salary=sc.nextFloat();
			System.out.println("Enter the teacher address: ");
			address=sc.next();
			System.out.println("Enter the teacher department: ");
			department=sc.next();
			System.out.println("Enter the teacher subject: ");
			subject=sc.next();
			
			
			teach [i]=new Teacher(tid,name,salary,address,department,subject);
			
			
		}
		System.out.println("***TEACHERS LIST***");
		for(Teacher tch : teach) {
			tch.display();
			System.out.println("\n");
			
		}
		sc.close();
	}
}

