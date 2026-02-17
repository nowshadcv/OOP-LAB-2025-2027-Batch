package OOPLAB;

import java.util.Scanner;
public class ComplexNumber {
	double real, img;
	ComplexNumber(double r, double i){
		real = r; //real and img are data members
		img = i;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) { //c1 and c2 are object of the class
		ComplexNumber temp = new ComplexNumber(0, 0); // new means instantiation
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
		
		ComplexNumber c1 = new ComplexNumber(p, q);
		ComplexNumber c2 = new ComplexNumber(r, t);
		ComplexNumber temp = sum(c1, c2);
		System.out.println("Sum is : " + temp.real + "+" + temp.img + "i");
	}
}
