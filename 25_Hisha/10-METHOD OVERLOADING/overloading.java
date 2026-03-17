package Module1;
import java.util.Scanner;

public class overloading {

    static class overloadingDemo {

        void area(float a) {
            System.out.println("The area of square is: " + Math.pow(a, 2) + " sq Unit");
        }

        void area(float a, float b) {
            System.out.println("The area of rectangle is: " + a * b + " sq Units");
        }

        void area(double r) {
            System.out.println("The area of circle is: " + 3.14 * r * r + " sq Units");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        overloadingDemo ar = new overloadingDemo();

        System.out.println("Enter the side of square:");
        float a = sc.nextFloat();
        ar.area(a);

        System.out.println("Enter the length and breadth of rectangle:");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        ar.area(l, b);

        System.out.println("Enter the radius of circle:");
        double r = sc.nextDouble();
        ar.area(r);
    }
}