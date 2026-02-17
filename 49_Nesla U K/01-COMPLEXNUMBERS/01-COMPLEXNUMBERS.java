package complex;

public class complexno {

	double real,img;
	complexno(double r,double i){
		real = r;img=i;
	}
public static complexno sum(complexno c1,complexno c2) {
	
	complexno temp = new complexno(0,0);
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	return temp;
}
public static void main (String args[]) {
	complexno c1=new complexno(5.5,4);
	complexno c2=new complexno(1.2,3.5);
	complexno temp = sum(c1,c2);
	System.out.printf("sum is :"+temp.real+"+"+temp.img +"i");
	
	
}
}