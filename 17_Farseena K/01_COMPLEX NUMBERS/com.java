package OOPLAB;
import java.util.Scanner;

public class com {
	double real,img;
	com(double r,double i){
		real =r;
		img=i;}
	public static complexnumbers sum(complexnumbers c1, complexnumbers c2)
	{
		complexnumbers temp=new complexnumbers(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter real part of first number");
		double r1=s.nextDouble();
		System.out.print("enter imginary part of first number");
		double c=s.nextDouble();
		System.out.print("enter real part of second number");
		double r2=s.nextDouble();
		System.out.print("enter imaginary part of second number");
		double cc=s.nextDouble();
		complexnumbers c1=new complexnumbers(r1,c);
		complexnumbers c2=new complexnumbers(r2,cc);
		complexnumbers temp=sum(c1, c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
		
		
	}}

