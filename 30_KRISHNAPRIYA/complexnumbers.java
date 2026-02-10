package OOPLAB;

public class complexnumbers {
	double real, img;
	complexnumbers(double r, double i){
		real = r; img = i;
	}
	
	public static complexnumbers sum (complexnumbers c1, complexnumbers c2) {
		complexnumbers temp = new complexnumbers(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp ;}
	
	public static void main(String args[]) {
		complexnumbers c1 = new complexnumbers(5.5,4);
		complexnumbers c2 = new complexnumbers(1.2,3.5);
		complexnumbers temp = sum (c1,c2);
		System.out.printf("Sum is : "+ temp.real + " + " + temp.img + " i ");}
		
	}
                                                   