package OOPLAB;

public class product_class {

    String pname, pcode;
    int price;

    public product_class() {}

    public product_class(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("pcode : " + pcode);
        System.out.println("pname : " + pname);
        System.out.println("price : " + price);
    }

    public static void main(String[] args) {

        product_class p1 = new product_class();
        p1.pcode = "Car123";
        p1.pname = "Benz";
        p1.price = 10000;
        System.out.println("Displaying p1:");
        p1.display();

        product_class p2 = new product_class("Jaguar", "Car426", 25000);
        System.out.println("Displaying p2:");
        p2.display();

        product_class p3 = new product_class("Maruthi", "Car800", 50000);
        System.out.println("Displaying p3:");
        p3.display();

        product_class p =
            p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price)
            ? p3
            : (p1.price < p2.price ? p1 : p2);

        System.out.println("\nDisplaying product with lowest price:");
        p.display();
    }
}
