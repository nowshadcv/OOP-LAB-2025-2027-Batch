package MODULE_1;
import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
	
}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	Scanner c=new Scanner(System.in);
	public void input(){
		Scanner c=new Scanner(System.in);
		r=c.nextInt();}
	public void area() {
		area=pi*r*r;
		System.out.println("AREA OF CIRCLE"+area);}
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("AREA OF PERIMETER"+perimeter);}
	}

class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	
	public void input(){
		Scanner r=new Scanner(System.in);
		
		l=r.nextInt();
		b=r.nextInt();}
	public void area() {
		area=l*b;
		System.out.println("AREA OF RECTACLE"+area);}
	public void perimeter(){
		perimeter=2*(l+b);
		System.out.println("PERIMETER OF RECTACLE"+perimeter);}
	}

	
	

public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1: AREA OF CIRCLE");
		System.out.println("2: AREA OF RECTANGLE");
		System.out.println("3: PERIMETER OF CIRCLE");
		System.out.println("4: PERIMETER OF RECTANGLKE");
		System.out.println("5: PROGRAM TERMINATION");
		lp:while(true) {
			System.out.println("MAKE YOUR CHOICE:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("ENTER THE RADIUS OF CIRCLE: \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANCLE \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("ENTER THE RADIUS OF CIRCLE: \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANCLE \n");
				r.input();
				r.perimeter();
				break;
			case 5:
				
				break  lp;
	default:
		System.out.println("INVALID CHOICE! PLEASE MAKE A VALID CHOICE.......");
			}
				
		}
		
	}

}
