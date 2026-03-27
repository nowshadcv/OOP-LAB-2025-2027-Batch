package OOPLAB;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

interface BillGen {
    int calculate();
}

class ProductB implements BillGen {
    String name;
    int prod_id, quantity, unit_price, total;

    ProductB() {}

    ProductB(String n, int p, int q, int u) {
        name = n;
        prod_id = p;
        quantity = q;
        unit_price = u;
    }

    public int calculate() {
        total = quantity * unit_price;
        return total;
    }
}

public class Bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        ProductB[][] order = new ProductB[n][];

        // INPUT SECTION
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter no. of Products: ");
            int m = sc.nextInt();
            sc.nextLine(); // buffer clear

            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                System.out.println("\nEnter Product " + (j + 1) + " Name: ");
                String a = sc.nextLine();   // fixed (supports spaces)

                System.out.println("Enter Product ID: ");
                int b = sc.nextInt();

                System.out.println("Enter Product Quantity: ");
                int c = sc.nextInt();

                System.out.println("Enter Product Unit Price: ");
                int d = sc.nextInt();
                sc.nextLine(); // buffer clear

                ProductB pb = new ProductB(a, b, c, d);
                order[i][j] = pb;
                order[i][j].total = order[i][j].calculate();
            }
        }

        // OUTPUT SECTION
        for (int i = 0; i < n; i++) {
            int sum = 0;

            System.out.println("\n===============================");
            System.out.println("Order No: " + (i + 1));

            Date date = Calendar.getInstance().getTime();
            System.out.println("Date: " + date);

            System.out.println("---------------------------------------------");
            System.out.printf("%10s %15s %10s %15s %10s\n",
                    "Prod_Id", "Name", "Quantity", "Unit_Price", "Total");
            System.out.println("---------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                System.out.printf("%10d %15s %10d %15d %10d\n",
                        order[i][j].prod_id,
                        order[i][j].name,
                        order[i][j].quantity,
                        order[i][j].unit_price,
                        order[i][j].total);

                sum += order[i][j].total;
            }

            System.out.println("---------------------------------------------");
            System.out.println("Net Amount: " + sum);
            System.out.println("---------------------------------------------");
        }

        sc.close();
    }
}