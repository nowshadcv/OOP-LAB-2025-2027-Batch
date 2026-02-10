package OOPLAB;

public class cars {
	public static void main (String args[]){
		productclass p1 = new productclass();
		p1.pcode = "Car123";
		p1.pname = "Benz";
		p1.price = 10000;
		System.out.println("Displaying p1:");
		p1.display();
		
		productclass p2 = new productclass("Jaguar","Car426",25000);
		System.out.println("Displaying p2:");
		p2.display();
		
		productclass p3 = new productclass("Maruthi","Car800",50000);
		System.out.println("Displaying p3:");
		p3.display();
		
		productclass p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\n Displaying product with lowest price:");
		p.display();
	}}
