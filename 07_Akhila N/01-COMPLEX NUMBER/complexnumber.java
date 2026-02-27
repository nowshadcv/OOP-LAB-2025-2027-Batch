package OOPLAB;

import java.util.Scanner;
public class complexnumber {
	

	    double real, img;

	    complexnumber(double r, double i) {
	        real = r;
	        img = i;
	    }

	    public static complexnumber sum(complexnumber c1, complexnumber c2) {
	    	complexnumber temp = new complexnumber(0, 0);
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

	        complexnumber c1 = new complexnumber(r1, i1);
	        complexnumber c2 = new complexnumber(r2, i2);

	        complexnumber temp = sum(c1, c2);

	        System.out.println("Sum is: " + temp.real + " + " + temp.img + " i");
	    }
	}

