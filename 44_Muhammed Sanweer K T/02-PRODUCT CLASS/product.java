package MODULE_1;

public class product {
	String pname, pcode;
	int price;
	
	public Product(){}
	
	Product(String pname, String pcode, int price) {
		this.pname=pname;
		this.pcode= pcode;
		this.price=price;
	
	}
	
	public void Setpname(String pname) {
		this.pname= pname;
	}
	public String Getpname() {
		return this.pname;
	}
	public void Setpcode(String pcode) {
		this.pcode= pcode;
	}
	public String Getpcode() {
		return pcode;
	}
	public void  Setprice(int price) {
		this.price = price;
	}
	public String Getprice() {
		return pcode;
	}
	
	public void display() {
		System.out.println("pcode:"+ this.pcode);
		System.out.println("pname:"+ this.pname);
		System.out.println("price:"+ this.price);
		
	}
	
	public static void main(String[] args) {
			
			
			Product p1 = new Product();
			p1.pcode="car1";
			p1.price=100000;
			p1.pname="Benz";
			System.out.println("\nDisplay P1:");
			p1.display();
			
			Product p2 = new Product("Jaguar","car2",500000);
			System.out.println("\nDisplay P2:");
			p2.display();
			
			Product p3 = new Product("Maruthi","car3",250000);
			System.out.println("\nDisplay P3:");
			p3.display();
			
			Product p= p3.price<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
			System.out.println("\nDisplaying Product with Lowest Price:");
			p.display();
		}
	
}
