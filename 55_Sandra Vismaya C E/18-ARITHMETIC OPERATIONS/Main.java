import Arithmetic.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        ArithmeticOperations add = new Add();
        ArithmeticOperations sub = new Subtract();
        ArithmeticOperations mul = new Multiply();
        ArithmeticOperations div = new Divide();

        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + sub.operate(a, b));
        System.out.println("Multiplication: " + mul.operate(a, b));
        System.out.println("Division: " + div.operate(a, b));

        sc.close();
    }
}
