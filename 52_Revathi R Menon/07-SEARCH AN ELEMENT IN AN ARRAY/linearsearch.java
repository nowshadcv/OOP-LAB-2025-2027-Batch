package ooplab;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int c,n,search,array[];
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter number of elements:");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter those  " +  n  +" elements");
		for( c=0;c<n;c++)
			array[c] = sc.nextInt();
		System.out.println("Enter the value you want to find:");
		search = sc.nextInt();
		for(c=0;c<n;c++)
			if(array[c] == search) {
				System.out.println(search+"is present in the location: "+(c+1));
				break;
			}
	    if (c==n)
	    	System.out.println(search + " is not present in the array.");
	    
        sc.close();
	}
}
