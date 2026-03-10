package MODULE_1;

import java.util.Scanner;

public class OverLoading {
	
	
		
    public static void main(String[] args) {
    	 class Over{
    			void area(float x)
    			{
    				System.out.println("area of sqaure is:"+Math.pow(x,2));
    			}
    			void area(float x,float y)
    			{
    				System.out.println("the area of rectangle is "+x*y);
    			}
    			void area(double x)
    			{
    				System.out.println("the area of the circle is:"+3.14*x*x);
    			}

    			
    		}
    	Scanner sc = new Scanner(System.in);
    	Over ov = new Over();
    	
    	System.out.println("enter the side of square to ");
    	float a = sc.nextFloat();
    	ov.area(a);
    	
    	System.out.println("enter the side of rectangle to ");
    	float b = sc.nextFloat();
    	float c = sc.nextFloat();
    	ov.area(b,c);
    	
    	System.out.println("enter the side of circle to (float) ");
    	double a1 = sc.nextFloat();
    	ov.area(a1);
    	
    	


    	
    	
    	   
    	sc.close();
    }

}

