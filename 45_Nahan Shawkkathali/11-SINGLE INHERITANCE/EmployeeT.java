package OOPLAB;
import java.util.Scanner;

class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT(){}

    EmployeeT(int empid,String name,float salary,String address){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT {
    String department, subject;

    Teacher(int empid,String name,float salary,String address,String department,String subject){
        super(empid,name,salary,address);
        this.department = department;
        this.subject = subject;
    }

    public void display(){
        System.out.println("Teacher id: " + empid);
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher salary: " + salary);
        System.out.println("Teacher address: " + address);
        System.out.println("Teacher department: " + department);
        System.out.println("Teacher subject: " + subject);
    }


public class TeacherArrObjects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of teachers:");
        int n = sc.nextInt();
        sc.nextLine();                                                           
        Teacher teacher[] = new Teacher[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nEnter teacher " + (i+1) + " details:");

            System.out.print("Enter teacher id: ");
            int tid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter teacher name: ");
            String name = sc.nextLine();

            System.out.print("Enter teacher salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            System.out.print("Enter teacher address: ");
            String address = sc.nextLine();

            System.out.print("Enter teacher department: ");
            String department = sc.nextLine();

            System.out.print("Enter teacher subject: ");
            String subject = sc.nextLine();

            teacher[i] = new Teacher(tid,name,salary,address,department,subject);
        }

        System.out.println("\nTeacher details are:\n");

        for(Teacher t : teacher){
            t.display();
            System.out.println();
        }

        sc.close();
    }
}
}