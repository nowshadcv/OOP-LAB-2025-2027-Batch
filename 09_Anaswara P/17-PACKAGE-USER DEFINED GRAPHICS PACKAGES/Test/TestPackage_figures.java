package Test;

import figures.*;
import java.util.Scanner;

public class TestPackage_figures {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.println("Enter the side of Square:");
        int s = sc.nextInt();
        Square sq = new Square(s);
        System.out.println("Perimeter: " + sq.perimeter());
        System.out.println("Area: " + sq.area());

        // Circle
        System.out.println("\nEnter the radius of Circle:");
        int r = sc.nextInt();
        Circle ci = new Circle(r);
        System.out.println("Perimeter: " + ci.perimeter());
        System.out.println("Area: " + ci.area());

        // Triangle
        System.out.println("\nEnter side1 of Triangle:");
        int s1 = sc.nextInt();
        System.out.println("Enter side2 of Triangle:");
        int s2 = sc.nextInt();
        System.out.println("Enter side3 of Triangle:");
        int s3 = sc.nextInt();

        Triangle tr = new Triangle(s1, s2, s3);
        System.out.println("Perimeter: " + tr.perimeter());
        System.out.println("Area: " + tr.area());

        sc.close();
    }
}