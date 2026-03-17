package OOPSLAB;
import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
}

class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input(){
		Scanner cir=new Scanner(System.in);
		r=cir.nextInt();
		
	}
	public void area() {
		area=pi*r*r;
		System.out.println("Area Of circle is = "+area);
	}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of Circle is = "+perimeter);
	}
}

class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input(){
		Scanner rec=new Scanner(System.in);
		l=rec.nextInt();
		b=rec.nextInt();
		
	}
	
	public void area() {
		area=l*b;
		System.out.println("Area Of Rectangle is = "+area);
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle is = "+perimeter);
		
	}
	
}

public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Perimeter of Circle");
		System.out.println("4.Perimeter of Rectangle");
		System.out.println("5.Exit");
		lp:while(true) {
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch){
			case 1:
				System.out.println("Enter the radius of circle:");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the radius of circle:");
				c.input();
				c.perimeter();
				break;
			case 3:
				System.out.println("Enter the length and breadth of rectangle:");
				r.input();
				r.area();
				break;
			case 4:
				System.out.println("Enter the length and breadth of rectangle:");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
			default:
				System.out.println("Invalid choice:");
				sc.close();
			}
	}

	}
}
