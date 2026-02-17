package MCA_S2_02;
import java.util.Scanner;
public class complexnumber {
	double real,img;
	
	complexnumber(double r,double i){
		real=r;
		img=i;
	}
		
	public static complexnumber sum(complexnumber c1, complexnumber c2){
		complexnumber temp = new complexnumber(0,0);
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
		
		
		
		complexnumber c1 = new complexnumber(a,b);
		complexnumber c2 = new complexnumber(c,d);
		complexnumber temp = sum(c1,c2);
		System.out.printf("sum is : "+ temp.real + "+" + temp.img + "i");
		s.close();
	}
}


