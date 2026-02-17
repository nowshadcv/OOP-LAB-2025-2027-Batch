package OOPLAB;

class Produc {
    String pname, pcode;
    int price;

    public Produc() {}

    public Produc(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("pcode: " + pcode);
        System.out.println("pname: " + pname);
        System.out.println("price: " + price + "\n");
    }
}

public class ProducMain {
    public static void main(String[] args) {

        Produc p1 = new Produc();
        p1.pcode = "car123";
        p1.pname = "Benz";
        p1.price = 10000;

        Produc p2 = new Produc("Jaguar", "car426", 25000);
        Produc p3 = new Produc("Maruthi", "car800", 50000);

        Produc p = p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price)
                ? p3
                : (p1.price < p2.price ? p1 : p2);

        System.out.println("Product with lowest price:");
        p.display();
    }
}
