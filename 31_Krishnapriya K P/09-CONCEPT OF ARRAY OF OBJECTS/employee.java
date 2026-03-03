package OOPLAB;
import java.util.Scanner;
public class employee
{
	int eNo,eSalary;
	String eName;
	public employee() {
		
	}
	public employee(int no,int sal ,String name) 
	{
		eNo=no;
		eSalary=sal;
		eName=name;
		}
	public void ShowData()
	{
		System.out.print("EmpId=" + eNo + " " + "Name=" + eName + " " + "salary=" + eSalary);
		System.out.println();
		}
	
	public static void main(String[]args) 
	{
		System.out.println("enter no of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter emmployee details one by one...");
		employee employees[]=new employee[n];
		Scanner  Semp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for (int i=0;i<n;i++) {
			System.out.println("enter "+i+"employee details...");
			System.out.println("enter employee id (integer):");
			eid=Semp.nextInt();
			System.out.println("enter employee name(String:");
			String nam=Semp.next();
			enam=new String(nam);
			System.out.println("enter employee salary(integer):");
			esal=Semp.nextInt();
			employee emp=new employee(eid,esal,enam);
			employees[i]=emp;}
		System.out.println("employees are:\n");
		for(employee y:employees)
			y.ShowData();
		System.out.println("enter employee no.of search:");
		int semp=sc.nextInt();
		boolean found=false;
		for(employee e:employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println("employee found..");
				e.ShowData();
				break;}}
		if(!found)
			    System.out.println("employee not found:");}}
			    
			
				
			
			
		
			
				
			
		
	
		
		


	
	
