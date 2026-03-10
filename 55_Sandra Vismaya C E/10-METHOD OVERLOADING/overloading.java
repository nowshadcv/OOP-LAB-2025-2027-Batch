package OOPLAB;

import java.util.Scanner;

class Area {

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

public class overloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square: ");
        float sq = sc.nextFloat();

        System.out.print("Enter length and breadth of rectangle: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.print("Enter radius of circle: ");
        double cir = sc.nextDouble();

        Area ob = new Area();

        ob.area(sq);
        ob.area(l, b);
        ob.area(cir);

        sc.close();
    }
}