package OOPLAB;

import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();
}

class Circle implements AP{
	int r;
	double pi=3.14,area,perimeter;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");
		r=sc.nextInt();
	}
	
	public void area() {
		area=pi * r * r;
		System.out.println("Area of circle :" +area);
	}
	
	public void perimeter() {
		perimeter=2 * pi * r;
		System.out.println("Perimeter of circle :"+perimeter);
	}
}

class Rectangle implements AP{
	int l,b;
	double area,perimeter;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length :");
		l=sc.nextInt();
		
		System.out.println("Enter breadth :");
		b=sc.nextInt();
	}
	
	public void area() {
		area=l * b;
		System.out.println("Area of rectangle ="+area);
	}
	
	public void perimeter() {
		perimeter=2 * ( l + b );
		System.out.println("Perimeter of rectangle :"+perimeter);
	}
}

public class IFaceDemo{
	public static void main(String args[]) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n 1.Area of circle :");
			System.out.println(" 2.Area of rectangle :");
			System.out.println(" 3.Perimeter of circle :");
			System.out.println(" 4.Perimeter of rectangle :");
			System.out.println(" 5.Exit :");
			
			System.out.print("\n Enter your choice :");
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
				System.out.println("Exiting program ....");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice !!!");
			}
		}
	}	
}
