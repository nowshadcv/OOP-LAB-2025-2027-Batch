package OOPLAB;

import java.util.Scanner;

public class OverLoadDemo {

    void area(float a) {
        System.out.println("The area of the square is " + Math.pow(a, 2) + " sq units");
    }

    void area(float a, float b) {
        System.out.println("The area of the rectangle is " + a * b + " sq units");
    }

    void area(double a) {
        double z = 3.14 * a * a;
        System.out.println("The area of the circle is " + z + " sq units");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        OverLoadDemo ob = new OverLoadDemo();

        System.out.println("Enter side of square:");
        float s = sc.nextFloat();
        ob.area(s);

        System.out.println("Enter length of rectangle:");
        float l = sc.nextFloat();
        System.out.println("Enter breadth of rectangle:");
        float b = sc.nextFloat();
        ob.area(l, b);

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        ob.area(r);

        sc.close();
    }
}