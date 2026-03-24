package OOPLAB;
import java.util.Scanner;
public class Employee {
    int eNo, eSalary;
    String eName;
    public Employee() {}
    public Employee(int no, int sal, String name) {
        eNo = no;
        eSalary = sal;
        eName = name;
    }
    public void showData() {
        System.out.println("EmpId = " + eNo + 
                           " Name = " + eName + 
                           " Salary = " + eSalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employee = new Employee[n];
        System.out.println("Enter employee details one by one:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));
            System.out.print("Enter employee id (integer): ");
            int eid = sc.nextInt();
            System.out.print("Enter employee name (String): ");
            String enam = sc.next();
            System.out.print("Enter employee salary (integer): ");
            int esal = sc.nextInt();
            employee[i] = new Employee(eid, esal, enam);
        }
        System.out.println("\nEmployees are:");
        for (Employee e : employee) {
            e.showData();
        }
        System.out.print("\nEnter employee id to search: ");
        int semp = sc.nextInt();
        boolean found = false;
        for (Employee e : employee) {
            if (semp == e.eNo) {
                found = true;
                System.out.println("Employee found:");
                e.showData();
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found...");
        }
       
    }
}
				
		