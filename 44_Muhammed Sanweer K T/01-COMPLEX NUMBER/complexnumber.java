package MODULE_1;

import java.util.Scanner;

public class complexnumber {
	
	double image, real ;
	
	ComplexNumber(double r, double i){
		real = r ; image = i;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
		ComplexNumber temp =new ComplexNumber(0,0);
		temp.real = c1.real+ c2.real;
		temp.image = c1.image+ c2.image;
		return temp;
		 
	}
	

	public static void main(String[] arg) {
		
		double r1,r2,i1,i2;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter the real part of First complex:");
		r1=s.nextDouble();
		
		System.out.print("Enter the image part of First complex:");
		i1=s.nextDouble();
		
		System.out.print("Enter the real part of Second complex:");
		r2=s.nextDouble();
		
		System.out.print("Enter the image part of Second complex:");
		i2=s.nextDouble();
		
		
		ComplexNumber N1 =new ComplexNumber(r1,i1);
		ComplexNumber N2 =new ComplexNumber(r2,i2);
		ComplexNumber value = sum(N1, N2);
		System.out.println("Sum is :"+ value.real+ "+" + value.image + "i");
		
	}
}
