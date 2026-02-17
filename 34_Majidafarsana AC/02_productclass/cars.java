package abida002;

public class cars {
	public static void main(String[] args) {`3
		product p1=new product();
		p1.pcode="car123";
		p1.pname="benz";
		p1.price=100000;
		System.out.println("DISPLAYING P1:");
		p1.display();
		product p2=new product("jaguar","car435",250000);
		System.out.println("DISPLAYING P2:");
		p2.display();
		product p3=new product("maruthi","car678",550000);
		System.out.println("DISPLAYING P3:");
		p3.display();
		product p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\n DISPLAYING PRODUCT WITH LOWEST PRICE:");
		p.display();
	}

}
