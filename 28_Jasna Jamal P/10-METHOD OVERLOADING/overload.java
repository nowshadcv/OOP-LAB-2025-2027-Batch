package OOPLAB;

import java.util.Scanner;
public class overload {
	void area(float x) {
		System.out.println("the area of square "+ Math.pow(x, 2)+" sq units");
	}
	void area (float x, float y) {
		float rect = x * y; 
		System.out.println("the area of the rectangle is " +rect+  " sq units");
	}
	void area(double x) {
		double circle = 3.14*x*x;
		System.out.println("the area of the circle is " + circle + " sq units");
	}
	public static void main(String args[]) {
		overload ob = new overload();
		float a,b,c;
		double k;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length (Side) of Square : ");
		a=s.nextFloat();
		ob.area(a) ;
		
		System.out.print("Enter the Length of Rectangle : ");
		b=s.nextFloat();
		System.out.print("Enter the Breadth of Rectangle : ");
		c=s.nextFloat();
		ob.area(b,c);
		
		System.out.print("Enter the Radius of Circle : ");
		k=s.nextDouble();
		ob.area(k);
		
		s.close();
	}
}