package ooplab;

import figures.*;
import java.util.Scanner;

public class TestPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square:");
        int s = sc.nextInt();
        Square sq = new Square(s);
        System.out.println("Perimeter: " + sq.perimeter());
        System.out.println("Area: " + sq.area());

        System.out.println("Enter the radius of circle:");
        int r = sc.nextInt();
        circle ci = new circle(r);
        System.out.println("Perimeter: " + ci.perimeter());
        System.out.println("Area: " + ci.area());

        System.out.println("Enter the sides of triangle:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        triangle tr = new triangle(s1, s2, s3);
        System.out.println("Perimeter: " + tr.perimeter());
        System.out.println("Area: " + tr.area());

        sc.close();
    }
}
