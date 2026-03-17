package OOPLAB;
import java.util.Scanner; 


interface AP{
	void input();
	void area();
	void perimeter();
	
}
class circle implements AP{
	int r=0;
	double pi = 3.14, area=0,perimeter=0;
	public void input() {
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
	}
	public void area() {
		area=pi*r*r;
		System.out.println("area of circle:"+area);
	}
	public void perimeter() {
		perimeter=pi*2*r;
		System.out.println("perimeter of circle:"+perimeter);
	}
}
class rectangle implements AP{
	int l=0,b=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
		
	}
	public void area() {
		area=l*b;
		System.out.println("area of rectangle:"+area);
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("perimeter of rectangle:"+perimeter);
	}
}


public class IFaceDemo {
	
	public static void main(String[] args) {
		int ch;
		circle c= new circle();
		rectangle r= new rectangle();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1.area of circle:");
		System.out.println("2.area of rectangle:");
		System.out.println("1.perimeter of circle:");
		System.out.println("2.perimeter of rectangle:");
		System.out.println("5.Program terminated");
		
		lp: while(true) {
			System.out.println("Make your choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the circle:");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the legth and breadth  of the rectangle:");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the radius of the circle:");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the legth and breadth  of the rectangle:");
				r.input();
				r.perimeter();
				break;
			case 5:
				break;
			
		default:
			System.out.println("Invalid");
			}
		}
		
		
		
		
	}

}
