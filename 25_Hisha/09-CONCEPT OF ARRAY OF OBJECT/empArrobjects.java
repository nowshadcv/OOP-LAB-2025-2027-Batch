package Module1;
import java.util.Scanner;
public class empArrobjects {
	public static void main(String[] args) {
		System.out.println("enter number of employee:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("enter employee details one by one...");
		employee employee[]=new  employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for(int i=0;i<n;i++) {
			System.out.println("Enter"+i+"Employee details...");
			System.out.println("Enter employee id(integer):");
			eid=scemp.nextInt();
			System.out.println("Enter employee name(String):");
			String nam=scemp.next();
			enam=new String(nam);
			System.out.println("Enter employee salary(integer):");
			esal=scemp.nextInt();
			employee emp=new employee(eid,esal,enam);
			employee[i]=emp;}
		System.out.println("Employees are:\n");
		for(employee y:employee)
			y.showData();
		System.out.println("Enter employee to search:");
		int semp=sc.nextInt();
		boolean found=false;
		for(employee e:employee) {
			if(semp==e.eno) {
				found=true;
				System.out.println("Employee found:");
				e.showData();
				break;}}
		if(!found)
			System.out.println("Employee not found...");
	
			}
	}

