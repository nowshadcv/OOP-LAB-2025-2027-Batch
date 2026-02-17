package OOPLAB;

public class cars {
	public static void main(String[]args) {
		Product p1=new Product("benz","car123",10000);
		System.out.println("Displaying p1: ");
		p1.display();
		
		Product p2=new Product("jaguar","car426",25000);
		System.out.println("Displaying p2: ");
		p2.display();
		
		Product p3=new Product("maruthi","car800",50000);
		System.out.println("Displaying p2: ");
		p3.display();
		
		Product p=p3.getprice()<(p1.price<p2.price ? p1.price:p2.price)? p3:(p1.price<p2.price ? p1:p2);
		System.out.println("\nDisplaying product with lowest price: ");
		p.display();
	}

}
