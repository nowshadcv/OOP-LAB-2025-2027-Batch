package MODULE_1;

import java.util.*;

class Publisher{

    String publisher;

    Publisher(String publi){
        this.publisher=publi;
    }
}

class Book{

    String name;
    Publisher publisher;

    Book(){}

    public Book(String name ,Publisher publisher){
        this.name = name;
        this.publisher= publisher;
    }
}

class Literature extends Book{

    String Lit_type="Literature";

    Literature(String name,Publisher publisher){
        super(name,publisher);
    }

    void display(){

        System.out.println("Name: "+ super.name);
        System.out.println("Type : "+ this.Lit_type);
        System.out.println("Publisher : "+ this.publisher.publisher);
    }
}

class Fiction extends Book{

    String Lit_type ="Fiction";

    Fiction(String name , Publisher publisher){
        super(name ,publisher);
    }

    void display(){

        System.out.println("Name: "+super.name);
        System.out.println("Type : "+this.Lit_type);
        System.out.println("Publisher : "+ this.publisher.publisher);
    }
}

public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Publisher: ");
            String pub = sc.nextLine();

            Publisher p = new Publisher(pub);

            System.out.print("Enter type (1-Literature, 2-Fiction): ");
            int ch = sc.nextInt();
            sc.nextLine();

            if(ch==1){

                Literature l = new Literature(name,p);
                l.display();
            }
            else{

                Fiction f=new Fiction(name,p);
                f.display();
            }

            System.out.println("----------------------");
        }

        sc.close();
    }
}