package OOPLAB;
import java.util.Scanner;
public class complexnumber {
	double real,img;
	 complexnumber(double r,double i){
		 real=r;img=i;}
	 
	 public static complexnumber sum(complexnumber c1,complexnumber c2){
			complexnumber temp=new complexnumber(0,0);
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;}
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter real part of first num:");
		 double r1=s.nextDouble();
		 System.out.print("Enter img part of first num:");
		 double c=s.nextDouble();
		 System.out.print("Enter real part of second num:");
		 double r2=s.nextDouble();
		 System.out.print("Enter img part of first num:");
		 double cc=s.nextDouble();
		 complexnumber c1=new complexnumber(5.5,4);
		 complexnumber c2=new complexnumber(1.2,3.5);
		 complexnumber temp=sum(c1,c2);
		 System.out.printf("Sum is:"+temp.real+"+"+temp.img+"i");
	 }

}


