package MODULE_1;

import java.util.Scanner;


public class overloading {

    public static void main(String[] args) {

		class overloadingmethod {

		
			void area(float side) {
				System.out.print("The area of Square is = " + side*side + " sq units");
			}
			void area(float side, float side2) {
				System.out.print("The area of rectangle is = " + side*side2 + " sq units");
			}
			void area(double side) {
				System.out.print("The area of circle is = " + side*3.14*3.14 + " sq units");
			}
		}
		
		int option;
		Scanner sc = new Scanner(System.in);
		overloadingmethod ob = new overloadingmethod();
		
		
		
		
		
		System.out.println ("-------------Area Menu------------");
        System.out.println ("1. Square:");
        System.out.println ("2. Rectangle:");
        System.out.println ("3. Circle:");
        
        
        System.out.println ("Enter the Option to use:");
        option = sc.nextInt();
              
        
        
        
        switch(option) {
	        case 1:
	        	 System.out.print ("Enter The side:");
	        	float side = sc.nextFloat();
	        	ob.area(side);
	        	break;
	        	
	        case 2:
	        	 System.out.print ("Enter Two side:");
	        	 float sider = sc.nextFloat();
	        	 float sider2 = sc.nextFloat();
	        	ob.area(sider,sider2);
	        	break;
	        	
	        case 3:
	        	 System.out.print ("Enter The Radius:");
	        	 Double side3 = sc.nextDouble();
	        	ob.area(side3);
	        	break;
        }
        
        sc.close();
    }
}






