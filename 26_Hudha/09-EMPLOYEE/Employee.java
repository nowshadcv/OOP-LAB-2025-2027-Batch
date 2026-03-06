package OOPLAB;
import java.util.Scanner;
public class Employee {
	int eno,esalary;
	String ename;
	public Employee( ){}
	public Employee(int no,int sal,String name){
		eno=no;
		esalary=sal;
		ename=name;}
	public void showData() {
		System.out.print("EmpId="+eno+""+"Name="+ename+""+"salary="+esalary);
		System.out.println();
	}
}
class EmpArrObjects{
	public static void main(String[] args) {
		System.out.println("enetre the num of emplees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter emp details one by one");
		Employee employees[ ]=new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++) {
			System.out.println("Enter"+i+"emplioyee details");
			System.out.println("enter emp id(int)");
			eid=scemp.nextInt();
			System.out.println("Enter emplioyee name");
			String nam=scemp.next();
			enam=new String(nam);
			System.out.println("Enter emplioyee sal");
		    esal=scemp.nextInt();
		    Employee emp=new Employee(eid,esal,enam);
		    employees[i]=emp;}
		System.out.println("empl are");
		for(Employee y : employees)
			y .showData();
		System.out.print("enter emp num to searcg");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e:employees){
			if(semp ==e.eno) {
				found=true;
				System.out.println("empliyee dounf");
				e.showData();
				break;}}
		if(!found)
			System.out.println("employee mot found");
		sc.close();
		scemp.close();
}}
