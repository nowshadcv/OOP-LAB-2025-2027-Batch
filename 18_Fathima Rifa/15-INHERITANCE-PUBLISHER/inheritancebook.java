package LABCYCLE;

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
    String type;   // Common type variable
    
    Book () { } 
    
    public Book (String name, Publisher publisher, String type) { 
        this.name = name; 
        this.publisher = publisher;
        this.type = type;
    }
} 

class Literature extends Book { 
    
    Literature (String name, Publisher publisher) { 
        super(name, publisher, "Literature");
    } 
    
    void display () { 
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Publisher: " + publisher.publisher);
    }
} 

class Fiction extends Book { 
    
    Fiction (String name, Publisher publisher) { 
        super(name, publisher, "Fiction");
    } 
    
    void display () {
        System.out.println("Name: " + name); 
        System.out.println("Type: " + type); 
        System.out.println("Publisher: " + publisher.publisher);
    }
} 

public class inheritancebook { 
    public static void main(String[] args){ 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Literature Book Name: ");
        String lname = sc.nextLine();
        System.out.print("Enter Literature Publisher: ");
        String lpub = sc.nextLine();

        Literature l = new Literature(lname, new Publisher(lpub));

        System.out.print("Enter Fiction Book Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Fiction Publisher: ");
        String fpub = sc.nextLine();

        Fiction f = new Fiction(fname, new Publisher(fpub));

        System.out.println("\n--- Book Details ---");
        l.display();
        f.display();

        sc.close();
    }
}