package MCA_S2_02;
import java.util.Scanner;
public class arrayobject {
public static void main(String[] args) {
		
		class Employee{
			int eNo, eSalary;
			String eName;
			public Employee() {}
			public Employee(int no, int sal, String name) {
				eNo=no;
				eSalary=sal;
				eName=name;
			}
			public void showData() {
				System.out.print("EmpId = " + eNo + " " + "Name = " + eName + " " + "Salary = " + eSalary);
				System.out.println();
			}
		}
		
		System.out.println("Enter Number of Employees : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Employee Details one by one..");
		Employee employees[] = new Employee[n];
		Scanner scemp = new Scanner(System.in);
		int eid, esal;
		String enam;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter " +i+ " Employee Details.. ");
			System.out.println("Enter Employee ID (integer) : ");
			eid = scemp.nextInt();
			System.out.println("Enter Employee Name (string) : ");
			String nam = scemp.next();
			enam = new String(nam);
			System.out.println("Enter Employee Salary (integer) : ");
			esal = scemp.nextInt();
			Employee emp = new Employee(eid, esal, enam);
			employees[i] = emp;
		}
		
		System.out.println("Employees are : \n ");
		for(Employee y : employees)
			y.showData();
		System.out.println("Enter Employee Number to Search : ");
		int semp = sc.nextInt();
		boolean found = false;
		for(Employee e : employees) {
			if(semp == e.eNo) {
				found = true;
				System.out.println("Employee Found... ");
				e.showData();
				break;	
			}
		}
		if(!found)
			System.out.println("Employee Not Found...");	
	}
}

