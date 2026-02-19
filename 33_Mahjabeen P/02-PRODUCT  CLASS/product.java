package OOPLAB;

import java.util.Scanner;

public class product {  

    String pname, pcode;
    int price;

    public product() {}

    public product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price + "\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

      
        System.out.println("Enter details for Product 1");
        System.out.print("Enter product code: ");
        p1.pcode = sc.nextLine();
        System.out.print("Enter product name: ");
        p1.pname = sc.nextLine();
        System.out.print("Enter product price: ");
        p1.price = sc.nextInt();
        sc.nextLine();

      
        System.out.println("\nEnter details for Product 2");
        System.out.print("Enter product code: ");
        p2.pcode = sc.nextLine();
        System.out.print("Enter product name: ");
        p2.pname = sc.nextLine();
        System.out.print("Enter product price: ");
        p2.price = sc.nextInt();
        sc.nextLine();

     
        System.out.println("\nEnter details for Product 3");
        System.out.print("Enter product code: ");
        p3.pcode = sc.nextLine();
        System.out.print("Enter product name: ");
        p3.pname = sc.nextLine();
        System.out.print("Enter product price: ");
        p3.price = sc.nextInt();

      
        System.out.println("\nDisplaying p1:");
        p1.display();

        System.out.println("Displaying p2:");
        p2.display();

        System.out.println("Displaying p3:");
        p3.display();

       
        product p = p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price)
                ? p3
                : (p1.price < p2.price ? p1 : p2);

        System.out.println("Displaying product with lowest price:");
        p.display();

        sc.close();
    }
}