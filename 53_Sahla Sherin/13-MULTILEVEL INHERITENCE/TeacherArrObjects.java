package LABCYCLE;
import java.util.Scanner;

class Persons {
    String name, gender, address;
    int age;

    Persons(){}

    Persons(String name, String gender, String address, int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employees extends Persons {
    String empid, company_name, qualification;
    float salary;

    Employees(){}

    Employees(String name, String gender, String address, int age,
              String empid, String company_name, String qualification, float salary){
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teachers extends Employees {   
    String subject, department, teacherid;

    Teachers(String name, String gender, String address, int age,
             String empid, String company_name, String qualification,
             float salary, String subject, String department, String teacherid){

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
        System.out.println("Department : " + department);
    }
}

public class TeacherArrObjects {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);

        System.out.print("Enter Number of Teachers : ");
        int n = sct.nextInt();

        Teachers teacher[] = new Teachers[n];  

        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i+1));

            System.out.print("Enter Teacher id : ");
            String tid = sct.next();

            System.out.print("Enter Employee id : ");
            String empid = sct.next();

            System.out.print("Enter name : ");
            String name = sct.next();

            System.out.print("Enter gender : ");
            String gender = sct.next();

            System.out.print("Enter address : ");
            String address = sct.next();
            
            System.out.print("Enter age : ");
            int age = sct.nextInt();
            sct.nextLine(); 

            System.out.print("Enter company name : ");
            String company_name = sct.nextLine();

            System.out.print("Enter department : ");
            String department = sct.nextLine();

            System.out.print("Enter qualification : ");
            String qualification = sct.nextLine();

            System.out.print("Enter subject : ");
            String subject = sct.nextLine();

            System.out.print("Enter salary : ");
            float salary = sct.nextFloat();

            teacher[i] = new Teachers(name, gender, address, age,
                    empid, company_name, qualification,
                    salary, subject, department, tid);
        }

        System.out.println("\nTeacher Details:\n");

        for(Teachers t : teacher) {
            t.display();
            System.out.println();
        }

        sct.close();
    }
}