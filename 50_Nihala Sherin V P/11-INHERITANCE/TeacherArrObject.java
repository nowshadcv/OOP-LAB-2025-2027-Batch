package MODULE_1;
import java.util.Scanner;
class EmployeeT{
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}}
 class Teacher extends EmployeeT{
	 String department,subject;
	 Teacher(int empid,String name,float salary,String address,String department,String subject){
		 super(empid,name,salary,address);
		 this.department=department;
		 this.subject=subject;}
	public void display()
	{
		System.out.println("Teacher id:" +empid);
		System.out.println("Teacher Name:"+name);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher department:"+department);
		System.out.println("Teacher subject:"+subject);
	}}

public class TeacherArrObject {
	public static void main(String[] args) {
		System.out.println("ENTER NO .OF TEACHERS:");;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("ENTER TEACHERS DETAILS ONE BY ONE..");
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid;String name;float salary;String address;String department;String subject;
		for( int i=0;i<n;i++) {
			System.out.println("enter" + i + "tracher details");
			System.out.println("enter teacher id(integer)");
			tid=sct.nextInt();
			System.out.println("enter teacher name");
			name=sct.next();
			System.out.println("enter salary");
			salary=sct.nextInt();
			System.out.println("enter teacher address");
			address=sct.next();
			System.out.println("enter teacher department:");
			department=sct.next();
			System.out.println("enter subject");
			subject=sct.next();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher [i] = t;
			System.out.println("teacher are:\n");
			for(Teacher x:teacher) {
				x.display();
				System.out.println("\n");
			}
		
			
		}
		
		
		
		
	}

}
