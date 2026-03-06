package OOPLAB;

import java.util.Scanner;

public class MethodOverloading 
{
	void area (float x) 
	{
		System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
	}
	void area (float x,float y)
	{
		System.out.println("The area of the rectangle is "+x*y+" sq units");
	}
	void area (double x)
	{
		double z=3.14*x*x;
		System.out.println("The area of the circle is "+z+" sq units");
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		MethodOverloading ob=new MethodOverloading();
		System.out.println("Enter the side of square:");
		float a=sc.nextFloat();
		ob.area(a);
		System.out.println("Enter the length and breadth of the rectangle:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		ob.area(l,b);
		System.out.println("Enter the radius of circle:");
		double r=sc.nextDouble();
		ob.area(r);
		sc.close();
	}
}