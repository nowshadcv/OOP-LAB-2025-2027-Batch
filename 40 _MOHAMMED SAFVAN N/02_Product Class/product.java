package OOPLAB;

public class product {

	String pname,pcode;
	int price ;
	public product() {} // is a constructor (class name = method name) , 2 type : default and parameterised.
	public product(String pname, String pcode, int price) {
		this.pname = pname; // this : refenrence variable that refers to the current object within an instance method or a constructor
		this.pcode = pcode;
		this.price = price; }
	public void setPname(String pname) {
		this.pname = pname; }
	public String getPcode() {
		return pcode;}
	public String getPname() {
		return pname;}
	public void setPcode(String pcode) {
		this.pcode = pcode; }
	public int getPrice() {
		return price ;}
	public void setPrice(int price) {
		this.price = price;}
	public void display( ) {
		System.out.println("pcode :" + this.pcode);
		System.out.println("pname :" + this.pname);
		System.out.println("price :" + this.price + "\n"); }
	
}

