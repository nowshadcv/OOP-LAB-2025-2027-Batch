package OOPLAB;

import java.util.Scanner;

public class COMPLEXNUMBERS {
	double real,img;
	COMPLEXNUMBERS(double r,double i){
		real=r; img=i;}
	public static COMPLEXNUMBERS sum(COMPLEXNUMBERS c1, COMPLEXNUMBERS c2) {
		COMPLEXNUMBERS temp= new COMPLEXNUMBERS(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter real part of frst num");
		double r1=s.nextDouble();
		System.out.print("Enter imag part of frst num");
		double c=s.nextDouble();
		System.out.println("Enter real part of scnd num");
		double r2=s.nextDouble();
		System.out.print("enter imag part of scnf num");
		double cc=s.nextDouble();
		COMPLEXNUMBERS c1= new COMPLEXNUMBERS(r1,c);
		COMPLEXNUMBERS c2=new COMPLEXNUMBERS(r2,cc);
		COMPLEXNUMBERS temp=sum(c1,c2);
		System.out.printf("Sum is:"+ temp.real+"+"+temp.img+"i");}
}
