package MODULE_1;
import java.util.Scanner;

interface ap {
    void input();
    void area();
    void perimeter();
}

class Circle implements ap {
    int r = 0;
    double pi = 3.14, area = 0, perimeter = 0;

    public void input() {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = c.nextInt();
    }

    public void area() {
        area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }

    public void perimeter() {
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}

class Rectangle implements ap {
    int l = 0, b = 0;
    double area, perimeter;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        l = r.nextInt();
        b = r.nextInt();
    }

    public void area() {
        area = l * b;
        System.out.println("Area of rectangle: " + area);
    }

    public void perimeter() {
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

public class IfaceDemo {
    public static void main(String[] args) {
        int ch;
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1: Area of Circle");
            System.out.println("2: Area of Rectangle");
            System.out.println("3: Perimeter of Circle");
            System.out.println("4: Perimeter of Rectangle");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    c.input();
                    c.area();
                    break;

                case 2:
                    r.input();
                    r.area();
                    break;

                case 3:
                    c.input();
                    c.perimeter();
                    break;

                case 4:
                    r.input();
                    r.perimeter();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 5);

        sc.close();
    }
}