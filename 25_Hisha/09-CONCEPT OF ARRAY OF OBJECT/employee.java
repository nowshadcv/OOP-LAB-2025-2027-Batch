package Module1;

public class employee {
	int eno,esalary;
	String eName;
	public employee() {}
	public employee(int no,int sal,String name) {
		eno=no;
		esalary=sal;
		eName=name;}
	public void showData() {
		System.out.print("empid="+eno+""+"Name="+eName+""+"salary="+esalary);
		System.out.println();
		}

}
