package OOPLAB;

import java.util.Scanner;

public class complexnumber {
	double real, img;

	complexnumber(double r, double i){
		real = r;
		img = i;
	}
	
	public static complexnumber sum(complexnumber c1, complexnumber c2) { 
		complexnumber temp = new complexnumber(0, 0); 
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	
	public static void main(String args[]) {
		
		double p,q,r,t;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the real part of first number : ");
		p = s.nextDouble();
		System.out.print("Enter the imaginary part of first number : ");
		q = s.nextDouble();
		System.out.print("Enter the real part of second number : ");
		r = s.nextDouble();
		System.out.print("Enter the imaginary part of second number : ");
		t = s.nextDouble();
		
		complexnumber c1 = new complexnumber(p, q);
		complexnumber c2 = new complexnumber(r, t);
		complexnumber temp = sum(c1, c2);
		
		System.out.println("Sum is : " + temp.real + "+" + temp.img + "i");
	}
}
