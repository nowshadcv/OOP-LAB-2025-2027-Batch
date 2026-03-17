package Module1;
import java.util.Scanner;

class EmployeeT
{
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT(){}

    EmployeeT(int empid,String name,float salary,String address)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}

class Teacher extends EmployeeT
{
    String department,subject;

    Teacher(int empid,String name, float salary , String address, String department , String subject)
    {
        super(empid,name,salary,address);
        this.department=department;
        this.subject=subject;
    }

    public void display()
    {
        System.out.println("Teacher id:"+empid);
        System.out.println("Teacher name:"+name);
        System.out.println("Teacher salary:"+salary);
        System.out.println("Teacher address:"+address);
        System.out.println("Teacher department:"+department);
        System.out.println("Teacher subject:"+subject);
    }
}
public class TeacherArr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Teachers:");
        int n=sc.nextInt();

        Teacher teacher[]=new Teacher[n];

        int tid;
        String name,address,department,subject;
        float salary;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" teacher details:");

            System.out.println("Enter teacher id:");
            tid=sc.nextInt();

            System.out.println("Enter teacher name:");
            name=sc.next();

            System.out.println("Enter teacher salary:");
            salary=sc.nextFloat();

            System.out.println("Enter teacher address:");
            address=sc.next();

            System.out.println("Enter teacher department:");
            department=sc.next();

            System.out.println("Enter teacher subject:");
            subject=sc.next();

            teacher[i]=new Teacher(tid,name,salary,address,department,subject);
        }

        System.out.println("\nTeachers are:\n");

        for(Teacher x:teacher)
        {
            x.display();
            System.out.println();
        }

        sc.close();
    }
}