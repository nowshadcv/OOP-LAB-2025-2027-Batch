package MODULE_1;
import java.util.Scanner;
public class Inheritance {



public static void main(String[] args) {
	class EmployeeT{
		
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
		String department,subject;
		Teacher(int empid,String name,float salary,String address,String department,String subject)
		{
			super(empid,name,salary,address);
			this.department=department;
			this.subject=subject;
			
		}
		public void display() {
			System.out.println("Teacher id :" +empid);
			System.out.println("Teacher name :" +name);
			System.out.println("Teacher salary :" +salary);
			System.out.println("Teacher address :" +address);
			System.out.println("Teacher department :" +department);
			System.out.println("Teacher Subject :" +subject);
		}
	}

	System.out.println("enter number of teachers");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Teacher details one by one");
	Teacher teacher[] = new Teacher[n];
	Scanner scT= new Scanner(System.in);
	int tid;String name;float salary;String address;String department;String subject;
	for(int i=0;i<n;i++)
	{
		System.out.println("enter"+ i +"teacher detasils");
		System.out.println("enter teacher id");
		tid=scT.nextInt();

		System.out.println("enter teacher name");
		name=scT.next();
		
		System.out.println("enter teacher salary");
		salary=scT.nextFloat();
		System.out.println("enter teacher address");
		address=scT.next();
		System.out.println("enter teacher department");
		department=scT.next();
		System.out.println("enter teacher subject");
		subject=scT.next();
		Teacher t = new Teacher(tid,name,salary,address,department, subject);
		teacher [i] = t;
	}
	System.out.println("teachers are: \n");
	for( Teacher x : teacher) {
		x.display();System.out.println("\n");
	}
	sc.close();
	scT.close();
		
		
		


		
	}
	
	
}
