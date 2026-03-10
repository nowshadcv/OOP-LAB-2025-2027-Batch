package ooplab;

import java.util.Scanner;

class OverLoadDemo {

    void area(float a) {
        System.out.println("The area of the square is " + (a * a) + " sq units");
    }

    void area(float a, float b) {
        System.out.println("The area of the rectangle is " + (a * b) + " sq units");
    }

    void area(double r) {
        double area = 3.14 * r * r;
        System.out.println("The area of the circle is " + area + " sq units");
    }
}

class OverLoad {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        OverLoadDemo ob = new OverLoadDemo();

        System.out.print("Enter side of square: ");
        float side = sc.nextFloat();
        ob.area(side);

        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float breadth = sc.nextFloat();
        ob.area(length, breadth);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        ob.area(radius);

        sc.close();
    }
}