package OOPLAB;

public class Products {
    private String pname;
    private String pcode;
    private int price;

    // Default constructor
    public Products() {}

    // Parameterized constructor
    public Products(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    // setters and getters
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
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
        System.out.println("pcode: " + pcode);
        System.out.println("pname: " + pname);
        System.out.println("price: " + price + "\n");
    }

    // main method inside same class
    public static void main(String[] args) {
        Products p1 = new Products();
        p1.setPcode("car123");
        p1.setPname("Benz");
        p1.setPrice(10000);
        System.out.println("Displaying p1:");
        p1.display();

        Products p2 = new Products("Jaguar", "car426", 25000);
        System.out.println("Displaying p2:");
        p2.display();

        Products p3 = new Products("Maruthi", "car800", 50000);
        System.out.println("Displaying p3:");
        p3.display();

        // find the lowest price
        Products lowest = p1;
        if (p2.getPrice() < lowest.getPrice()) {
            lowest = p2;
        }
        if (p3.getPrice() < lowest.getPrice()) {
            lowest = p3;
        }

        System.out.println("Displaying product with lowest price:");
        lowest.display();
    }
}
