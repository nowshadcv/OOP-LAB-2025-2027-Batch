package Program1;
import java.util.Scanner;

public class complexnuminp {
		double real,img;
		
		complexnuminp(double r,double i){
			real=r;
			img=i;
		}
			
		public static complexnuminp sum(complexnuminp c1, complexnuminp c2){
			complexnuminp temp = new complexnuminp(0,0);
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
			
			
			
			complexnuminp c1 = new complexnuminp(a,b);
			complexnuminp c2 = new complexnuminp(c,d);
			complexnuminp temp = sum(c1,c2);
			System.out.printf("sum is : "+ temp.real + "+" + temp.img + "i");
			s.close();
		}
	}