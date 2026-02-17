package mca_s2_27;
import java.util.Scanner;

public class complexnum {
	double real,img;
	
	complexnum(double r,double i){
		real=r;
		img=i;
	}
		
	public static complexnum sum(complexnum c1, complexnum c2){
		complexnum temp = new complexnum(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	
	public static void main(String args[]) {
		double a,b,c,d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Real Part of c1 : ");
		a=s.nextDouble();
		
		System.out.print("Enter The Imaginary Part of c1 : ");
		b=s.nextDouble();
		
		System.out.print("Enter The Real Part of c2 : ");
		c=s.nextDouble();
		
		System.out.print("Enter The Imaginary Part of c2 : ");
		d=s.nextDouble();
		
		
		
		complexnum c1 = new complexnum(a,b);
		complexnum c2 = new complexnum(c,d);
		complexnum temp = sum(c1,c2);
		System.out.printf("sum is : "+ temp.real + "+" + temp.img + "i");
		s.close();
	}
}
