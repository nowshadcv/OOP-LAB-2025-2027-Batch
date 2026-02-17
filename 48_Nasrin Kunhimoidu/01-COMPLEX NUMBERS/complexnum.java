package COMPLEXNUM;

public class complexnum{
	double real ,img;

complexnum(double r,double i)
{
	real = r ;
	img= i ;
}


public static complexnum sum(complexnum c1,complexnum c2){
	complexnum temp= new complexnum(0,0);
	temp.real = c1.real + c2.real;
	temp.img = c1.img +c2.img;
	return temp ;}
public static void main (String args[]) {
	complexnum c1 = new complexnum(5.5,4);
	complexnum c2 = new complexnum(1.2,3.5);
	complexnum temp = sum(c1,c2);
	System.out.printf("Sum is:"+temp.real + "+" + temp.img + "i");}
}