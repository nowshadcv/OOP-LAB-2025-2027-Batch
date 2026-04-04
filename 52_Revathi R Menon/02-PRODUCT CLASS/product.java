package ooplab;

import java.util.Scanner;

public class Product {
       String pname,pcode;
       int price;
       public Product() {}
       public Product(String pname, String pcode, int price) {
    	   this.pname = pname;
    	   this.pcode = pcode;
    	   this.price = price;
       }
       public void setPname(String pname){
    	   this.pname = pname; }
       public String getPcode() {
    	   return pcode; }
       public String getPname() {
    	   return pname; }
       public void setPcode(String pcode) {
    	   this.pcode = pcode; }
       public int getPrice() {
    	   return price ; }
       public void setPrice(int price) {
    	   this.price = price; }
       public void display() {
    	   System.out.println("pcode: "+this.pcode);
    	   System.out.println("pname: "+this.pname);
    	   System.out.println("price: "+this.price+"\n");
    	   
       }
}

class cars{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        // Input for p1
        Product p1 = new Product();
        System.out.println("Enter details for product 1:");
        System.out.print("Pcode: ");
        p1.pcode = sc.nextLine();
        System.out.print("Pname: ");
        p1.pname = sc.nextLine();
        System.out.print("Price: ");
        p1.price = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("\nDisplaying p1:");
        p1.display();

        // Input for p2
        System.out.println("Enter details for product 2:");
        System.out.print("Pcode: ");
        String pcode2 = sc.nextLine();
        System.out.print("Pname: ");
        String pname2 = sc.nextLine();
        System.out.print("Price: ");
        int price2 = sc.nextInt();
        sc.nextLine(); // consume newline

        Product p2 = new Product(pname2, pcode2, price2);
        System.out.println("\nDisplaying p2:");
        p2.display();

        // Input for p3
        System.out.println("Enter details for product 3:");
        System.out.print("Pcode: ");
        String pcode3 = sc.nextLine();
        System.out.print("Pname: ");
        String pname3 = sc.nextLine();
        System.out.print("Price: ");
        int price3 = sc.nextInt();
        sc.nextLine(); // consume newline

        Product p3 = new Product(pname3, pcode3, price3);
        System.out.println("\nDisplaying p3:");
        p3.display();

		
        // Find product with lowest price
        Product p = p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price) ? p3 : (p1.price < p2.price ? p1 : p2);
        System.out.println("\nDisplaying product with lowest price:");
        p.display();

        sc.close();
	}
}
