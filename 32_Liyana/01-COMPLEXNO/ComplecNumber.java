package oop;

import java.util.Scanner;

public class ComplecNumber {
    double real, img;

    ComplecNumber(double r, double i) {
        real = r;
        img = i;
    }

    public static ComplecNumber sum(ComplecNumber c1, ComplecNumber c2) {
        return new ComplecNumber(
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

        ComplecNumber c1 = new ComplecNumber(r1, i1);
        ComplecNumber c2 = new ComplecNumber(r2, i2);

        ComplecNumber result = sum(c1, c2);

        System.out.println("Sum is: " + result);

        sc.close();
    }
}