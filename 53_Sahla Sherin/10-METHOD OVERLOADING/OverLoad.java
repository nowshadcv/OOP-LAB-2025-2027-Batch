package OOPSLAB;
import java.util.Scanner;

public class OverLoad {
	void area(float a) {
		System.out.println("Area of the square is "+Math.pow(a,2)+" sq units");
	}
	void area(int l,int b) {
		int Rarea=l*b;
		System.out.println("Area of Rectangle is"+Rarea+" sq units");
	}
	void area(double r) {
		double Carea=3.14*r*r;
		System.out.println("Area of Rectangle is"+Carea+" sq units");
	}
	public static void main(String[] args) {
		Scanner ov=new Scanner(System.in);
		OverLoad over=new OverLoad();
		
		System.out.println("Enter the square side: ");
		float a=ov.nextFloat();
		over.area(a);
		
		System.out.println("Enter the length of Rectangle: ");
		int l=ov.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		int b=ov.nextInt();
		over.area(l,b);
		
		System.out.println("Enter the radius of circle: ");
		double r=ov.nextDouble();
		over.area(r);
		
		ov.close();
	}
}