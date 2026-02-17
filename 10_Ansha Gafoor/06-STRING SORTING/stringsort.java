package OOPLAB;

import java.util.Arrays;
import java.util.Scanner;

public class stringsort {

    public static void main(String[] args) {

        int count;
        String tmp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of strings to sort: ");
        count = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        String[] strlist = new String[count];

        System.out.println("Enter your strings:");
        for (int i = 0; i < count; i++) {
            strlist[i] = scan.nextLine();
        }

        System.out.println("Choose 1 or 2 from the menu below:");
        System.out.println("1 : in-built sort");
        System.out.println("2 : user-defined sort");

        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                Arrays.sort(strlist);
                System.out.println("Sorted strings (In-built):");
                System.out.println(Arrays.toString(strlist));
                break;

            case 2:
                for (int i = 0; i < count - 1; i++) {
                    for (int j = i + 1; j < count; j++) {
                        if (strlist[i].compareTo(strlist[j]) > 0) {
                            tmp = strlist[i];
                            strlist[i] = strlist[j];
                            strlist[j] = tmp;
                        }
                    }
                }
                System.out.println("Sorted strings (User-defined):");
                System.out.println(Arrays.toString(strlist));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scan.close();
    }
}
