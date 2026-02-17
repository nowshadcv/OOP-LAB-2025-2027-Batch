package OOPLAB;

import java.util.Scanner;

public class complexnumbers {
	double real,img;
	complexnumbers(double r,double i){
		real=r;
		img=i;
	}
	public static complexnumbers sum(complexnumbers c1, complexnumbers c2){
		complexnumbers temp = new complexnumbers (0,0);
		temp.real = c1. real + c2. real;
		temp.img = c1.img + c2.img;
		return temp ;}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part of first number:");
		double r1=sc.nextDouble();
		System.out.print("Enter imaginary part of first number:");
		double i1=sc.nextDouble();
		System.out.print("Enter real part of second number:");
		double r2=sc.nextDouble();
		System.out.print("Enter imaginary part of second number:");
		double i2=sc.nextDouble();
		complexnumbers c1 = new complexnumbers (r1,i1) ;
		complexnumbers c2 = new complexnumbers (r2,i2);
		complexnumbers temp = sum ( c1, c2 ) ;
		System.out.printf("Sum is : "+ temp.real + "+" + temp.img + "i" ) ;}

}
