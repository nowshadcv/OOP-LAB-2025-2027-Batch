package OOPLAB;
import java.util.Scanner;
public class linearsearch {
	public static void main(String[] args) {
		int c , n , search , array[];
		Scanner in =new Scanner (System.in);
		System.out.print("enter number of elements: ");
		n=in.nextInt();
		array=new int[n];
		System.out.print("Enter those " +n+ " elements ");
		for(c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.print("Enter the value you want to find : ");
		search=in.nextInt();
		for(c=0;c<n;c++)
			if(array[c]==search) {
				System.out.print(search+" is present in the location: "+(c+1));
				break;
			}
		if(c==n)
			System.out.print(search+" is not present in the array ");
	}
	

}
