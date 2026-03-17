package OOPLAB;
import java.util.Scanner;
class OverloadDemo 
{
	    
	    
		void area(float x)
		{
			System.out.println("The area of square is "+Math.pow(x, 2)+" sq units");
		}
		void area(float y,float r)
		{
			System.out.println("The area of rectangle is "+y*r+" sq units");
		}
		void area(double w)
		{
			double z=3.14*w*w;
			System.out.println("The area of circle is "+z+" sq units");
		}
		public static void main(String args[]) {
			OverloadDemo ob=new OverloadDemo();
			Scanner s = new Scanner (System.in);
			System.out.println("Enter the length of the square:");
			float x=s.nextInt();
			ob.area(x);
			System.out.println("Enter the length of the rectangle:");
			float y=s.nextInt();
			System.out.println("Enter the width of the rectangle:");
			float r=s.nextInt();
			ob.area(y,r);
			System.out.println("Enter the radius of the circle:");
			double w=s.nextInt();
			ob.area(w);
			s.close();

		}
		
		
}
