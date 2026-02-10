package OOPLAB;
import java.util.Scanner;
public class complexnumbers {
	double real, img;
	complexnumbers(double r, double i){
		real = r; img = i;}
	public static complexnumbers sum(complexnumbers c1, complexnumbers c2) {
		complexnumbers temp = new complexnumbers (0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;}
	public static void main(String args[]){
		double r1,r2,i1,i2;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter real part of first complex number: ");
        r1 = s.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        i1 = s.nextDouble();
        System.out.print("Enter real part of Second complex number: ");
        r2 = s.nextDouble();
        System.out.print("Enter imaginary part of Second complex number: ");
        i2 = s.nextDouble();
		complexnumbers c1 = new complexnumbers(r1,i1);
		complexnumbers c2 = new complexnumbers(r2,i2);
		complexnumbers temp = sum(c1, c2);
		System.out.printf("Sum is: " +temp.real + "+" +temp.img+ "I");}
}



