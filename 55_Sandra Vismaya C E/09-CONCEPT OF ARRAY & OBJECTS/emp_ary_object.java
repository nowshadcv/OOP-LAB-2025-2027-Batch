package OOPLAB;
import java.util.Scanner;

class Employee {
    int eNo, eSalary;
    String eName;
    
    public Employee(int no, int sal, String name) {
        eNo = no;
        eSalary = sal;
        eName = name;
    }
    public void showData() {
        System.out.println("EmpId = " + eNo + " Name = " + eName + " Salary = " + eSalary);
    }
}
public class emp_ary_object {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        Employee employees[] = new Employee[n];

        System.out.println("Enter employee details one by one...");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee id:");
            int eid = sc.nextInt();
            System.out.println("Enter employee name:");
            String ename = sc.next();
            System.out.println("Enter employee salary:");
            int esal = sc.nextInt();
            
            employees[i] = new Employee(eid, esal, ename);
        }
        System.out.println("\nEmployees are:");
        for (Employee e : employees) {
            e.showData();
        }
        System.out.println("Enter employee number to search:");
        int sempo = sc.nextInt();
        boolean found = false;
        for (Employee e : employees) {
            if (sempo == e.eNo) {
                found = true;
                System.out.println("Employee found:");
                e.showData();
                break;
            }
        }
        if (!found)
            System.out.println("Employee not found");
        sc.close();
    }
}