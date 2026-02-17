
package compexnumber;


public class compexnumber {

	double real,img;
	complexno(double r,double i){
		real = r;img=i;
	}
public static complexno sum(compexnumber c1,compexnumber c2) {
	
	compexnumber temp = new compexnumber(0,0);
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	return temp;
}
public static void main (String args[]) {
	compexnumber c1=new compexnumber(5.5,4);
	compexnumber c2=new compexnumber(1.2,3.5);
	compexnumber temp = sum(c1,c2);
	System.out.printf("sum is :"+temp.real+"+"+temp.img +"i");
	
	
}
}