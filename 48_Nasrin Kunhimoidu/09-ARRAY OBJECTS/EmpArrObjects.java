package OOPLAB;

public class EmpArrObjects
{
	int eno, esalary;
	String ename;

	public EmpArrObjects(){}

	public EmpArrObjects(int no, int sal, String name)
	{
		eno = no;
		esalary = sal;
		ename = name;
	}

	public void showData()
	{
		System.out.println("EmpId = " + eno + " Name = " + ename + " Salary = " + esalary);
	}
}