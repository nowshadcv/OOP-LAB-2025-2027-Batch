package program10;

import java.util.Scanner;
public class overload {
	void area(float x) {
	System.out.println("the area of the square is" + Math.pow(x,2)+"sq units");
}
	void area(float x,float y) 
	{
		float rec = x * y;
		System.out.println("the area of the circle is"+rec+"sq units");
	}
	void area(double x)
	{
	double z=3.14*x*x;
	System.out.println("the area of the circle is"+z+"sq units");
	}
	public static void main(String args[]) {
		overload ob = new overload();
		float a,b,c;
		double d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side of the Square");
		a=sc.nextFloat();
		ob.area(a);
		
		System.out.println("Enter the Length of the Rectangle");
		b=sc.nextFloat();
		System.out.println("Enter the Breadth of the Rectangle");
		c=sc.nextFloat();
		ob.area(b,c);
		System.out.println("Enter the Radius of the Circle");
		d=sc.nextDouble();
		ob.area(d);
	
	sc.close();
}
}
