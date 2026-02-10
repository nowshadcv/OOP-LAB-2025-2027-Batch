package COMPLEXNUM;

import java.util.Scanner;

public class ucomplexnum {
    double real, img;
    ucomplexnum(double r, double i) {
        real = r;
        img = i;
    }
    public static ucomplexnum sum(ucomplexnum c1, ucomplexnum c2) {
        ucomplexnum temp = new ucomplexnum(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        ucomplexnum c1 = new ucomplexnum(r1, i1);
        ucomplexnum c2 = new ucomplexnum(r2, i2);

        ucomplexnum temp = sum(c1, c2);

        System.out.println("Sum is: " + temp.real + " + " + temp.img + "i");

        sc.close();
    }
}
