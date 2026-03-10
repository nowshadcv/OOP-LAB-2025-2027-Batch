package OOPLAB;

import java.util.Scanner;

public class OverLoadDemo {
	void area(float d) { 
	System.out.println("The area of the square is "+Math.pow(d, 2)+" sq units");
	}
	void area(float f, float g) { 
	System.out.println("The area of the rectangle is "+f*g+" sq units");
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
		float d=sc.nextFloat();
		System.out.println("Enter length of the rectangle :");
		float f=sc.nextFloat();
		System.out.println("Enter breadth of the rectangle :");
		float g=sc.nextFloat();
		System.out.println("Enter radius of the circle :");
		float h=sc.nextFloat();
		ob.area(d); 
		ob.area (f, g); 
		ob.area (h); 
		sc.close();
	}
}


