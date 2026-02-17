package OOPLAB;

public class car {
	public static void main(String[] args) {
		
		productclass p1 = new productclass();
		p1.pcode = "car123";
		p1.pname = "Benz";
		p1.price = 1000000;
		System.out.println("Displaying p1:");
		p1.display();
		
		productclass p2 = new productclass("Jaguar" , "car456" , 2500000 );
		System.out.println("Displaying p2:");
		p2.display();
		
		productclass p3 = new productclass("Maruthi" , "car789" , 3500000 );
		System.out.println("Displaying p3: ");
		p3.display( ) ;
		
		productclass p = (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		
		}
		
	}

