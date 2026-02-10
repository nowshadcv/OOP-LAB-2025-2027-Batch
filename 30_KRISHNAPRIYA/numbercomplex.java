package OOPLAB;

import java.util.Scanner;
public class numbercomplex {
	

	    double real, img;

	    numbercomplex(double r, double i) {
	        real = r;
	        img = i;
	    }

	    public static numbercomplex sum(numbercomplex c1, numbercomplex c2) {
	        numbercomplex temp = new numbercomplex(0, 0);
	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        return temp;
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter real part of first complex number: ");
	        double r1 = sc.nextDouble();
	        System.out.print("Enter imaginary part of first complex number: ");
	        double i1 = sc.nextDouble();

	        System.out.print("Enter real part of second complex number: ");
	        double r2 = sc.nextDouble();
	        System.out.print("Enter imaginary part of second complex number: ");
	        double i2 = sc.nextDouble();

	        numbercomplex c1 = new numbercomplex(r1, i1);
	        numbercomplex c2 = new numbercomplex(r2, i2);

	        numbercomplex temp = sum(c1, c2);

	        System.out.println("Sum is: " + temp.real + " + " + temp.img + " i");
	    }
	}

