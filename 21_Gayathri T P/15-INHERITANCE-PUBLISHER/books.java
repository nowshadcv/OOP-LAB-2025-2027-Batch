package OOPLAB;

import java.util.Scanner;

class Publisher { 
    String publisher; 
    Publisher(String publi){
        this.publisher = publi ;
    }
}

class Book { 
    String name; 
    Publisher publisher; 
    
    Book () { } 
    
    public Book (String name, Publisher publisher ) { 
        this.name = name ; 
        this.publisher = publisher ;
    }
} 

class Literature extends Book { 
    String Lit_type="Literature"; 
    
    Literature (String name, Publisher publisher ) { 
        super (name, publisher);
    } 
    
    void display () { 
        System.out.println("Name: " + super.name);
        System.out.println("Type: " + this.Lit_type);
        System.out.println("Publisher: " + this.publisher.publisher);
    }
} 

class Fiction extends Book { 
    String Lit_type="Fiction"; 
    
    Fiction (String name, Publisher publisher ) { 
        super (name, publisher);
    } 
    
    void display () {
        System.out.println("Name: " + super.name); 
        System.out.println("Type: " + this.Lit_type); 
        System.out.println("Publisher: " + this.publisher.publisher);
    }
} 

public class books { 
    public static void main(String[] args){ 
        
        Scanner sc = new Scanner(System.in);

        // Literature input
        System.out.print("Enter Literature Book Name: ");
        String lname = sc.nextLine();
        System.out.print("Enter Literature Publisher: ");
        String lpub = sc.nextLine();

        Publisher lp = new Publisher(lpub);
        Literature l = new Literature(lname, lp);

        // Fiction input
        System.out.print("Enter Fiction Book Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Fiction Publisher: ");
        String fpub = sc.nextLine();

        Publisher fp = new Publisher(fpub);
        Fiction f = new Fiction(fname, fp);

        System.out.println("\n--- Book Details ---");
        l.display();
        f.display();

        sc.close();
    }
}