package OOPLAB;

import java.util.Scanner;

class Employee {
    int eNO, eSalary;
    String eName;

    public Employee() {}

    public Employee(int no, int sal, String name) {
        eNO = no;
        eSalary = sal;
        eName = name;
    }

    public void showData() {
        System.out.print("Empid=" + eNO + " Name=" + eName + " Salary=" + eSalary);
        System.out.println();
    }
}

 class emparrobjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        int eid, esal;
        String enam;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " employee details..");

            System.out.println("Enter employee id:");
            eid = sc.nextInt();

            System.out.println("Enter employee name:");
            enam = sc.next();

            System.out.println("Enter employee salary:");
            esal = sc.nextInt();

            Employee emp = new Employee(eid, esal, enam);
            employees[i] = emp;
        }

        System.out.println("Employees are:\n");

        for (Employee y : employees)
            y.showData();

        System.out.println("Enter employee number to search:");
        int semp = sc.nextInt();

        boolean found = false;

        for (Employee e : employees) {
            if (semp == e.eNO) {
                found = true;
                System.out.println("Employee found.");
                e.showData();
                break;
            }
        }

        if (!found)
            System.out.println("Employee not found..");

        sc.close();
    }
}