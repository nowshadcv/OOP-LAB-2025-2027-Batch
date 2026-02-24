
package OOPLAB;

import java.util.Scanner;

public class complexN {
    double real, img;

    complexN(double r, double i) {
        real = r;
        img = i;
    }

    public static complexN sum(complexN c1, complexN c2) {
        return new complexN(
            c1.real + c2.real,
            c1.img + c2.img
        );
    }

    public String toString() {
        return real + " + " + img + "i";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        complexN c1 = new complexN(r1, i1);
        complexN c2 = new complexN(r2, i2);

        complexN result = sum(c1, c2);

        System.out.println("Sum is: " + result);

        sc.close();
    }
}
