package OOPLAB;
import java.util.Scanner;
class Overloaddemo {
    void area(float x) {
        System.out.println("The area of square is: " + Math.pow(x, 2) + " sq units");
    }
    void area(float x, float y) {
        System.out.println("The area of rectangle is: " + (x * y) + " sq units");
    }
    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is: " + z + " sq units");
    }
}
public class Overload {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloaddemo ob = new Overloaddemo();
        float side, length, breadth;
        double radius;
        System.out.println("Enter side of square:");
        side = sc.nextFloat();
        ob.area(side);
        System.out.println("Enter length of rectangle:");
        length = sc.nextFloat();
        System.out.println("Enter breadth of rectangle:");
        breadth = sc.nextFloat();
        ob.area(length, breadth);
        System.out.println("Enter radius of circle:");
        radius = sc.nextDouble();
        ob.area(radius);
        sc.close();
    }
}