package OOPLAB;

import java.util.Scanner;

public class OverLoadDemo {
	void area(float a) { 
	System.out.println("The area of the square is "+Math.pow(a, 2)+" sq units");
	}
	void area(float b, float c) { 
	System.out.println("The area of the rectangle is "+b*c+" sq units");
	} 
	void area(double x) { 
	double z = 3.14 * x * x; 
	System.out.println("The area of the circle is "+z+" sq units"); 
	}
	} 
	
class OverLoad { 
	public static void main(String args[]) { 
		OverLoadDemo ob = new OverLoadDemo(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of the square :");
		float a=sc.nextFloat();
		System.out.println("Enter length of the rectangle :");
		float b=sc.nextFloat();
		System.out.println("Enter breadth of the rectangle :");
		float c=sc.nextFloat();
		System.out.println("Enter radius of the circle :");
		double h=sc.nextFloat();
		ob.area(a); 
		ob.area (b, c); 
		ob.area (h); 
		sc.close();
	}
}

