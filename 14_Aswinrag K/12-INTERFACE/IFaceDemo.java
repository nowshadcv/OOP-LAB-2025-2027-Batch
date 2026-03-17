package OOPLAP;

import java.util.Scanner;

interface AP{
    void input(Scanner sc);
    void area();
    void perimeter();
}

class Circle implements AP{
    int r = 8;
    double area = 0, perimeter = 0;
    double pi = 3.14;

    public void input(Scanner sc){
        r = sc.nextInt();
    }

    public void area(){
        area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }

    public void perimeter(){
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}

class Rectangle implements AP{
    int l = 10, b = 8;
    double area, perimeter;

    public void input(Scanner sc){
        l = sc.nextInt();
        b = sc.nextInt();
    }

    public void area(){
        area = l * b;
        System.out.println("Area of rectangle: " + area);
    }

    public void perimeter(){
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

public class IFaceDemo {
    public static void main(String[] args) {

        int ch;
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Area of Circle");
        System.out.println("2: Area of Rectangle");
        System.out.println("3: Perimeter of Circle");
        System.out.println("4: Perimeter of Rectangle");
        System.out.println("5: Program termination");

        while(true){
            System.out.print("Make your choice: ");
            ch = sc.nextInt();

            switch(ch){
            
                case 1:
                    System.out.println("Enter the radius of the Circle");
                    c.input(sc);
                    c.area();
                    break;

                case 2:
                    System.out.println("Enter the length and breadth of the Rectangle");
                    r.input(sc);
                    r.area();
                    break;

                case 3:
                    System.out.println("Enter the radius of the Circle");
                    c.input(sc);
                    c.perimeter();
                    break;

                case 4:
                    System.out.println("Enter the length and breadth of the Rectangle");
                    r.input(sc);
                    r.perimeter();
                    break;

                case 5:
                    System.out.println("Program terminated");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please make a valid choice..");
            }
        }
    }
}