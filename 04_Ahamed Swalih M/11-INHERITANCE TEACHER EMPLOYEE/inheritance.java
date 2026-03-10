package MODULE_1;

import java.util.Scanner;


class Employee {
    int empid;
    String name;
    float salary;
    String address;
    Employee() {}
    
    Employee(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;

    }

}




class Teacher extends Employee {
    String department, subject;
    Teacher(int empid, String name, float salary, String address,String department, String subject) {
    	super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher id : " + empid);
        System.out.println("Teacher name : " + name);
        System.out.println("Teacher salary : " + salary);
        System.out.println("Teacher address : " + address);
        System.out.println("Teacher department : " + department);
        
        System.out.println("Teacher subject : " + subject);
    }

}



public class inheritance {
    public static void main(String[] args) {
        System.out.println("Enter number of Teachers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Teacher details one by one...");
        Teacher teacher[] = new Teacher[n];
        int tid;
        String name;
        float salary;
        String address;
        String department;
        String subject;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " teacher details...");
            System.out.println("Enter teacher id (integer): ");
            tid = sc.nextInt();
            System.out.println("Enter teacher name (String): ");
            name = sc.next();
            System.out.println("Enter teacher salary (float): ");
            salary = sc.nextFloat();
            System.out.println("Enter teacher address (String): ");
            address = sc.next();
            System.out.println("Enter teacher department (String): ");
            department = sc.next();
            System.out.println("Enter teacher subject (String): ");
            subject = sc.next();
            Teacher t = new Teacher(tid, name, salary, address, department, subject);
            teacher[i] = t;
        }
        System.out.println("\nTeachers are:\n");

        for (Teacher x : teacher) {
            x.display();
            System.out.println();
        }
        sc.close();
    }
}