package OOPLAB;

public class productclass {
	String pname,pcode ;
	int price ;
	public productclass() {}
	public productclass(String pname, String pcode, int price) {
		this.pname = pname;
		this.pcode = pcode;
		this.price = price; }
	public void setpname(String pname) {
		this.pname = pname; }
	public String getpcode() {
		return pcode;}
	public String getpname() {
		return pname;}
	public void setpcode ( String pcode ) {
		this.pcode = pcode ;}
	public int getprice() {
		return price ;}
	public void setprice(int price) {
		this.price = price ;}
	public void display( ) {
		System.out.println("pcode :" + this.pcode);
		System.out.println("pname :" + this.pname);
		System.out.println("price :" + this.price + "\n") ;}}
 
		
		

	


