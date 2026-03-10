package OOPLAB;

import java.util.Scanner;


public class overloaddemo {
	void area(float x) {
		System.out.println("The area of the square is "+Math.pow(x, 2)+"sq units");
	}
	void area(float x,float y) {
		System.out.println("The area of the rectangle is "+ x*y +" sq units");
	}
	void area(double x) {
		double z=3.14*x+x;
		System.out.println("The area of the circle is "+ z +" sq units");
	}

}
class overload{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for square: ");
		int sq = sc.nextInt();
		System.out.print("Enter the length and breadth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter radius of circle: ");
		int cir = sc.nextInt();
		overloaddemo ob=new overloaddemo();
		ob.area(sq);
		ob.area(l,b);
		ob.area(cir);
		sc.close();
		}
}
