package ooplab;

import java.util.Scanner;

class Publisher { 
    String publisher; 

    Publisher(String publi){ 
        this.publisher = publi;
    }
}

class Book {  
    String name; 
    Publisher publisher; 

    Book () { } 

    public Book (String name, Publisher publisher ) { 
        this.name = name; 
        this.publisher = publisher;
    }
} 

class Literature extends Book { 
    String litType = "Literature"; 

    Literature (String name, Publisher publisher ) { 
        super(name, publisher);
    } 

    void display () { 
        System.out.println("Name: " + super.name);
        System.out.println("Type: " + this.litType); 
        System.out.println("Publisher: " + this.publisher.publisher);
    }
} 

class Fiction extends Book { 
    String litType = "Fiction"; 

    Fiction (String name, Publisher publisher ) { 
        super(name, publisher);
    } 

    void display () { 
        System.out.println("Name: " + super.name); 
        System.out.println("Type: " + this.litType); 
        System.out.println("Publisher: " + this.publisher.publisher);
    }
} 

public class InheritanceBook { 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        // Input for Literature
        System.out.print("Enter Literature Book Name: ");
        String lname = sc.nextLine();

        System.out.print("Enter Literature Publisher: ");
        String lpub = sc.nextLine();

        Publisher lp = new Publisher(lpub);
        Literature l = new Literature(lname, lp);

        // Input for Fiction
        System.out.print("\nEnter Fiction Book Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Fiction Publisher: ");
        String fpub = sc.nextLine();

        Publisher fp = new Publisher(fpub);
        Fiction f = new Fiction(fname, fp);

        // Output
        System.out.println("\n--- Literature Book Details ---");
        l.display();

        System.out.println("\n--- Fiction Book Details ---");
        f.display();

        sc.close();
    }
}
