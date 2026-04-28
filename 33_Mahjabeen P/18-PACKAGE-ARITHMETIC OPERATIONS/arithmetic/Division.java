package arithmetic;

public class Division  implements ArithmeticOperations {
    public double operate(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}