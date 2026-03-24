package OOPLAB;

import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

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

    Employee(String name, String gender, String address, int age,
             String empid, String company_name, String qualification, float salary) {

        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

 class Teacher extends Employee {
    String subject, department, teacherId;

    Teacher(String name, String gender, String address, int age,
            String empid, String company_name, String qualification, float salary,
            String subject, String department, String teacherId) {

        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class TeacherArrObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Teacher[] teacher = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            String empid = sc.nextLine();

            System.out.print("Company Name: ");
            String company = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            String teacherId = sc.nextLine();

            teacher[i] = new Teacher(
                    name, gender, address, age,
                    empid, company, qualification, salary,
                    subject, department, teacherId
            );
        }

        System.out.println("\n--- Teacher Details ---");

        for (Teacher t : teacher) {
            t.display();
            System.out.println();
        }

        sc.close();
    }
}