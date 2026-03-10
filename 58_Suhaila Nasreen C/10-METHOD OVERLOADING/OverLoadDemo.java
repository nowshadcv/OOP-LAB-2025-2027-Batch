package OOPLAB;

import java.util.Scanner;

public class OverLoadDemo {
	Scanner sc = new Scanner(System.in);
	void area(float x) {
		System.out.println("The area o the the square: "+ Math.pow(x,2) + "sq units");}
	void area(float x,float y) {
		System.out.println("The area of the rectangle is "+x*y+" sq units");}
	void area(double r) {
		double z=3.14*r*r;
		System.out.println("The area of circle is "+z+" sq units");
	}

}
class Overload{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		OverLoadDemo ob=new OverLoadDemo();
		
		System.out.print("Enter side of square: ");
        float s = sc.nextFloat();
        ob.area(s);
		
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        ob.area(l,b);
        
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        ob.area(r);
	}
}