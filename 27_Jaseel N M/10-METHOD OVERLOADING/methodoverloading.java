package mca_s2_27;
import java.util.Scanner;
public class methodoverload {
	void arear(float x) {
		System.out.println("the area of square "+ Math.pow(x, 2)+" sq units");
	}
	void area (float x, float y) {
		float rect = x * y; 
		System.out.println("the area of the rectangle is " +rect+  " sq units");
	}
	void area(double x) {
		double circ = 3.14*x*x;
		System.out.println("the area of the circle is " +circ+ " sq units");
	}
	public static void main(String args[]) {
		methodoverload ob = new methodoverload();
		float a,b,c;
		double d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Side of Square : ");
		a=s.nextFloat();
		ob.area(a) ;
		
		System.out.print("Enter The Length of Rectangle : ");
		b=s.nextFloat();
		System.out.print("Enter The Breadth of Rectangle : ");
		c=s.nextFloat();
		ob.area(b,c);
		
		System.out.print("Enter The Radius of Circle : ");
		d=s.nextDouble();
		ob.area(d);
		
		s.close();
	}
}
