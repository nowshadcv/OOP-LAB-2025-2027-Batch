package OOPLAB;
import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person() {}

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    String empid, company_name, qualification;
    float salary;

    Employee() {}

    Employee(String name, String gender, String address, int age,
             String empid, String company_name,
             String qualification, float salary) {

        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department, teacherid;

    Teacher(String name, String gender, String address, int age,
            String empid, String company_name,
            String qualification, float salary,
            String subject, String department, String teacherid) {

        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    public void display() {
        System.out.println("Teacher ID        : " + teacherid);
        System.out.println("Employee ID       : " + empid);
        System.out.println("Name              : " + name);
        System.out.println("Gender            : " + gender);
        System.out.println("Address           : " + address);
        System.out.println("Age               : " + age);
        System.out.println("Company Name      : " + company_name);
        System.out.println("Qualification     : " + qualification);
        System.out.println("Salary            : " + salary);
        System.out.println("Subject           : " + subject);
        System.out.println("Department        : " + department);
    }
}

public class TeacherArrObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Teachers: ");
        int n = sc.nextInt();

        Teacher[] teacher = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Teacher ID: ");
            String tid = sc.next();

            System.out.print("Employee ID: ");
            String empid = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Gender: ");
            String gender = sc.next();

            System.out.print("Address: ");
            String address = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Company Name: ");
            String company_name = sc.next();

            System.out.print("Department: ");
            String department = sc.next();

            System.out.print("Qualification: ");
            String qualification = sc.next();

            System.out.print("Subject: ");
            String subject = sc.next();

            System.out.print("Salary: ");
            float salary = sc.nextFloat();

            teacher[i] = new Teacher(
                    name, gender, address, age,
                    empid, company_name, qualification, salary,
                    subject, department, tid
            );
        }

        System.out.println("\n--- Teacher Details ---\n");

        for (Teacher t : teacher) {
            t.display();
            System.out.println();
        }

        sc.close();
    }
}