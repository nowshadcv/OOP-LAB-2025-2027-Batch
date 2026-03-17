package MODULE_1;

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
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
	}
	public void area(){
		area=pi*r*r;
		System.out.println("Area of Circle:"+area);
	}
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("Perimeter of Circle:"+perimeter);
	}
}


class Rectangle implements AP{
	int br=0,ln=0;
	double area=0,perimeter=0;
	
	public void input(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Length");
		ln=sc.nextInt();
		System.out.println("Enter the Breadth");
		br=sc.nextInt();
		
	}
	public void area(){
		area=br*ln;
		System.out.println("Area of Rectangle:"+area);
	}
	public void perimeter(){
		perimeter=2*(ln+br);
		System.out.println("Perimeter of Rectangle:"+perimeter);
	}
}


public class InterfaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c =new Circle();
		Rectangle r = new Rectangle();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. Area of Circle");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Perimeter of Circle");
		System.out.println("4. Perimeter of Rectangle");
		System.out.println("5. Program of Termination");
		
		Ip:while(true) {
			System.out.println("Make Your Choice:");
			ch=sc.nextInt();
			switch(ch) {
				case 1:

					c.input();
					c.area();
					break;
				case 2:
					
					r.input();
					r.area();
					break;
				case 3:
					c.input();
					c.perimeter();
					break;
				case 4:
					r.input();
					r.perimeter();
					break;
				case 5:
					break Ip;
					
				default:
					System.out.println("Invalid choice! Please make a Valid choice...");
					
					
				
			}
		}
	}

}
