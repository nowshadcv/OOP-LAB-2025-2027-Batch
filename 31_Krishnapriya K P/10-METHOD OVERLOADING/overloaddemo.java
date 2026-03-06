package OOPLAB;

import java.util.Scanner;

public class overloaddemo 
{
	void area (float x) 
	{
		System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	}
	void area (float x,float y)
	{
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}
	void area (double x)
	{
		double z=3.14*x*x;
		System.out.println("the area of the circle is "+z+" sq units");
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		overloaddemo ob=new overloaddemo();
		System.out.println("enter the side of square:");
		float a=sc.nextFloat();
		ob.area(a);
		System.out.println("enter the length and breadth of the rectangle:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		ob.area(l,b);
		System.out.println("enter the radius of circle:");
		double r=sc.nextDouble();
		ob.area(r);
		sc.close();
	}
}
