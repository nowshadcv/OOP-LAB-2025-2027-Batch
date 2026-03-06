package OOPLAB;

import java.util.Scanner;

class OverloadDemo {
    void area(float x) {
        System.out.println("The area of the square is " + (x * x) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + (x * y) + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

public class Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadDemo ob = new OverloadDemo();

       
        System.out.println("Enter the side of the square:");
        float side = sc.nextFloat();
        ob.area(side);

        System.out.println("Enter length and breadth of the rectangle:");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        ob.area(length, breadth);

       
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        ob.area(radius);

        sc.close(); 
    }
}