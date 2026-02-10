package OOPLAB;

public class complex_number {

double real , img ;

complex_number(double r , double i){
	real = r ;  img = i ;}
			
public static complex_number sum(complex_number c1, complex_number c2){
	complex_number temp = new complex_number(0,0);
	temp.real = c1.real + c2.real;
	temp.img = c1.img + c2.img;
	return temp ;}

public static void main (String args[]) {
	complex_number c1 = new complex_number(5.5,4);
	complex_number c2 = new complex_number(1.2,3.5);
	complex_number temp = sum ( c1 , c2 ) ;
	System.out.printf("Sum is : "+temp.real + "+" + temp.img + "i" ) ;}
}//End.
	

