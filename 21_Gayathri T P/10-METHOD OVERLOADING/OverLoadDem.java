package OOPLAB;

import java.util.Scanner;

public class OverLoadDem {
    
    void area(float g) {
        System.out.println("The Area of the Square is " + Math.pow(g, 2) + " sq units");
    }

    void area(float g, float i) {
        System.out.println("The Area of the Rectangle is " + g * i + " sq units");
    }

    void area(double g) {
        double z = 3.14 * g * g;
        System.out.println("The Area of the Circle is " + z + " sq units");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        OverLoadDem ob = new OverLoadDem();

        System.out.println("Enter side of square:");
        float square = sc.nextFloat();
        ob.area(square);

        System.out.println("Enter length and breadth of rectangle:");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        ob.area(length, breadth);

        System.out.println("Enter radius of circle:");
        double radius = sc.nextDouble();
        ob.area(radius);

        sc.close();
    }
}