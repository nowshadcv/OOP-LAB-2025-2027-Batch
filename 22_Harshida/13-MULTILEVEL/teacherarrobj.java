package OPLAB;
import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;
    Person(){}
    Person(String name, String gender, String address, int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;}}
class Employee extends Person {
    String empid, company_name, qualification;
    float salary;
    Employee(){}
    Employee(String name, String gender, String address, int age, String empid, String company_name, String qualification, float salary){
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;}}
class Teacher extends Employee {
    String subject, department, teacherid;
    Teacher(String name, String gender, String address, int age, String empid, String company_name, String qualification, float salary, String subject, String department, String teacherid){
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }
    public void display() {
        System.out.println("Teacher id : " + teacherid);
        System.out.println("Teacher name : " + name);
        System.out.println("Teacher gender : " + gender);
        System.out.println("Teacher address : " + address);
        System.out.println("Teacher age : " + age);
        System.out.println("Employee id : " + empid);
        System.out.println("Company name : " + company_name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary : " + salary);
        System.out.println("Subject : " + subject);
        System.out.println("Department : " + department);}}
public class teacherarrobj {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter Number of Teachers : ");
        int n = sct.nextInt();
        Teacher teacher[] = new Teacher[n];
        String name, company_name, qualification, gender, address;
        String department, subject, empid, tid;
        int age;
        float salary;
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i+1));
            System.out.print("Enter Teacher id : ");
            tid = sct.next();
            System.out.print("Enter Employee id : ");
            empid = sct.next();
            System.out.print("Enter name : ");
            name = sct.next();
            System.out.print("Enter gender : ");
            gender = sct.next();
            System.out.print("Enter address : ");
            address = sct.next();
            System.out.print("Enter age : ");
            age = sct.nextInt();
            System.out.print("Enter company name : ");
            company_name = sct.next();
            System.out.print("Enter department : ");
            department = sct.next();
            System.out.print("Enter qualification : ");
            qualification = sct.next();
            System.out.print("Enter subject : ");
            subject = sct.next();
            System.out.print("Enter salary : ");
            salary = sct.nextFloat();
            teacher[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary, subject, department, tid);}
        System.out.println("\nTeacher Details:\n");
        for(Teacher t : teacher) {
            t.display();
            System.out.println();
        }
        sct.close();
    }
}