package OOPLAB;
import java.util.Scanner;
class employee {
    int eNo, eSalary;
    String eName;
    public employee(int no, int sal, String name) {
        eNo = no;
        eSalary = sal;
        eName = name;
    }
    public void showData() {
        System.out.println("empid = " + eNo + 
                           " name = " + eName + 
                           " salary = " + eSalary);
        System.out.println();
    }
}
public class emparrobjects {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        employee employees[] = new employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter employee " + (i + 1) + " details:");
            System.out.print("Enter employee id: ");
            int eid = sc.nextInt();
            System.out.print("Enter employee name: ");
            String enam = sc.next();
            System.out.print("Enter employee salary: ");
            int esal = sc.nextInt();
            employees[i] = new employee(eid, esal, enam);
        }
        System.out.println("\nEmployees are:");
        for (employee e : employees) {
            e.showData();
        }
        System.out.print("Enter employee number to search: ");
        int searchId = sc.nextInt();
        boolean found = false;
        for (employee e : employees) {
            if (searchId == e.eNo) {
                System.out.println("\nEmployee found:");
                e.showData();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found...");
        }

        sc.close();
    }
}