package OOPLAB;
import java.util.Scanner;
public class car_product {
	static class Product {
		String pname, pcode;
		int price;
		public Product(String pname, String pcode, int price) {
			this.pname = pname;
			this.pcode = pcode;
			this.price = price;}
		public int getPrice() {
			return price;}
		public void display() {
			System.out.println("Product Code: " + pcode);
			System.out.println("Product Name: " + pname);
			System.out.println("Price: " + price);
			System.out.println(); }}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for Car 1:");
		System.out.print("Enter Car Name: ");
		String name1 = sc.next();
	    System.out.print("Enter Car Code: ");
	    String code1 = sc.next();
	    System.out.print("Enter Price: ");
	    int price1 = sc.nextInt();
	    
	    System.out.println("\nEnter details for Car 2:");
	    System.out.print("Enter Car Name: ");
	    String name2 = sc.next();
	    System.out.print("Enter Car Code: ");
	    String code2 = sc.next();
	    System.out.print("Enter Price: ");
	    int price2 = sc.nextInt();

	    System.out.println("\nEnter details for Car 3:");
	    System.out.print("Enter Car Name: ");
	    String name3 = sc.next();
	    System.out.print("Enter Car Code: ");
	    String code3 = sc.next();
	    System.out.print("Enter Price: ");
	    int price3 = sc.nextInt();

	    Product p1 = new Product(name1, code1, price1);
	    Product p2 = new Product(name2, code2, price2);
	    Product p3 = new Product(name3, code3, price3);

	    System.out.println("\n--- Car Details ---");
	    p1.display();
	    p2.display();
	    p3.display();
 
	    Product lowest = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3 : (p1.price<p2.price?p1:p2); 
	    System.out.println("--- Car with Lowest Price ---");
	    lowest.display();
	    }
	}

