package OOPLAB;

import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();}
class Circle implements AP{
	int r =0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
		Scanner c=new Scanner(System.in);
		r=c.nextInt();}
	public void area() {
		area=pi*r*r;
		System.out.println("Area of circle:"+area);}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of circle:"+perimeter);
	}
}
class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();}
	public void area() {
		area=l*b;
		System.out.println("Area of rectangle"+area);}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("Perimeter of rectangle:"+perimeter);}
	}

public class IFaceDemo{
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1. aREA OF cIRCLE");
		System.out.println("2. aREA OF RECTANGLE");
		System.out.println("3. PERIMETE OF CIRCLE");
		System.out.println("4. PERIMETE OF RECTANGLE");
		System.out.println("5. PROGRAM TERMINATION");
	
		lp : while(true) {
			System.out.print("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("enter the radius of the circle");
				c.input();
				break;
			case 2:
				System.out.print("entr the length and breadth of the rectangle:");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("entr the radius of th ecircle");;
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("entr the length and breadth of redctangle");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
			default:
				System.out.println("invalid choice");
}}}}