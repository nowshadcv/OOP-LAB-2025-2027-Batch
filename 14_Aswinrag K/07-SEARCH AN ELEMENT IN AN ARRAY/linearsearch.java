package OOPLAB;


import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int c = 0; c < n; c++) {
            array[c] = in.nextInt();
        }

        System.out.println("Enter the value you want to find:");
        int search = in.nextInt();

        boolean found = false;

        for (int c = 0; c < n; c++) {
            if (array[c] == search) {
                System.out.println(search + " is present at location: " + (c + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(search + " is not present in the array.");
        }

        in.close();
    }
}