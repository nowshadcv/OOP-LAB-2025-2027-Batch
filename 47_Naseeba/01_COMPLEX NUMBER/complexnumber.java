package OOPLAB;

public class COMPLEXNUMBER {
	double real ,img ;
	COMPLEXNUMBER(double r, double i){
		real = r;  img = i ;}
	public static COMPLEXNUMBER sum(COMPLEXNUMBER c1,COMPLEXNUMBER c2) {
		COMPLEXNUMBER temp = new COMPLEXNUMBER(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp ;}
	public static void main (String args[]) {
		COMPLEXNUMBER c1 = new COMPLEXNUMBER(5.5,4);
		COMPLEXNUMBER c2 = new COMPLEXNUMBER(1.2,3.5);
		COMPLEXNUMBER temp = sum ( c1 , c2 ) ;
		System.out.printf("sum is : "+ temp.real +  "+" + temp.img + "i" ) ;
	}


}
