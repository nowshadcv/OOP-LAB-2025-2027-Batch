package MODULE_1;

import java.util.Scanner;

class Person {
	String name;
	String gender;
	String address;
	int age;
	Person(){}
	Person(String name, String gender, String address,int age){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;}}


class Employees extends Person{
	String company_name,qualification;
	int empid;
	float salary;
	Employees(){}
	Employees(String name, String gender, String address,int age, int empid,String company_name, String qualification, float salary){
		super(name,gender,address,age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;}
}



class Teachers extends Employees{
	String subject,department;
	int teacherid;
	public Teachers(String name, String gender , String address , int age,int empid,String company_name,String qualification,float salary,String subject,String department,int teacherid){
	super(name,gender,address,age,empid,company_name,qualification,salary);
	 this.subject = subject;
     this.department = department;
     this.teacherid = teacherid;
	}
	
	public void display() {
		System.out.println("Teacher id : " +teacherid);
		System.out.println("Teacher Employee id : " +empid);
		System.out.println("Teacher name : " +name);
		System.out.println("Teacher gender : " +gender);
		System.out.println("Teacher address : " +address);
		System.out.println("Teacher age : " +age);
		System.out.println("Teacher company_name : " +company_name);
		System.out.println("Teacher qualification : " +qualification);
		System.out.println("Teacher salary : " +salary);
		System.out.println("Teacher teacher_id : " +teacherid);
		System.out.println("Teacher subject : " +subject);
		System.out.println("Teacher department : " +department);
	}
}




public class TeacherArrObjects {
	public static void main(String[] args) {
		System.out.println("Enter Number of Teachers : ");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teacher Details One by One .. ");
		Teachers teacher[]=new Teachers[n];
		int tid,age,empid; String name,company_name,qualification,gender;float salary;String address;
		String department ;
		String subject;
		
		for(int i=0;i<n;i++){
			System.out.println("Enter details of Teacher " +(i+1) );
			System.out.println("Enter Teacher id (integer) : " );
			tid=sc.nextInt();
			System.out.println("Enter Employee id of Teacher "+(i+1)+" (integer) : " );
			empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Teacher name (String) : " );
			name=sc.nextLine();
			System.out.println("Enter Teacher gender (String) : " );
			gender=sc.nextLine();
			System.out.println("Enter Teacher address (String) : " );
			address=sc.nextLine();
			System.out.println("Enter Teacher age (integer) : " );
			age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Teacher company name (String) : " );
			company_name=sc.nextLine();
			System.out.println("Enter Teacher department (String) : " );
			department=sc.nextLine();
			System.out.println("Enter Teacher qualification (String) : " );
			qualification=sc.nextLine();
			System.out.println("Enter Teacher Subject (String) : " );
			subject=sc.nextLine();
			System.out.println("Enter Teacher salary (float) : " );
			salary=sc.nextFloat();
			Teachers t = new Teachers(name,gender ,address,age,empid,company_name,qualification,salary,subject,department,tid);
			teacher[i]=t;
		}
				System.out.println("Teacher are : \n " );
				for(Teachers x : teacher) {
					x.display();
					System.out.println("\n " );
				}
			sc.close();
		}
	}