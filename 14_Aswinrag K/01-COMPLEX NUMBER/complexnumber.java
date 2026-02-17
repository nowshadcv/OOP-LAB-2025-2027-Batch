package OOPLAB;

import java.util.Scanner;

public class ComplexNumber {
    double real, img;
    
    ComplexNumber(double r, double i) {
        real = r;
        img = i;
    }
    
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
      
        return new ComplexNumber(c1.real + c2.real, c1.img + c2.img);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        double r1 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i1 = sc.nextDouble();
        ComplexNumber c1 = new ComplexNumber(r1, i1);

  
        System.out.println("\nEnter second complex number:");
        System.out.print("Real part: ");
        double r2 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i2 = sc.nextDouble();
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        ComplexNumber result = sum(c1, c2);

        System.out.print("\nThe sum is: " + result.real + " + " + result.img + "i");
        
        sc.close();
    }
}