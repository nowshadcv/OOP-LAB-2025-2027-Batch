package OOPLAB;

import java.util.Scanner;

public class matrixadd {
	public static void main(String[]args) {
		int p,q,m,n ;
		Scanner s = new Scanner (System.in) ;
		System.out.print ("enter number of rows in matrix a: ") ;
		p = s.nextInt();
		System.out.print ("enter number of column in matrix a: ") ;
		q = s.nextInt();
		System.out.print ("enter number of rows in matrix b: ") ;
		m = s.nextInt();
		System.out.print ("enter number of column in matrix b: ") ;
		n = s.nextInt();
		if ( p == m && q == n ){
			int a[][] = new int[p][q] ;
			int b[][] = new int[m][n] ;
			System.out.println("enter the element of matrix a: ") ;
			for ( int i=0 ; i < p ; i++)
				for ( int j = 0 ; j < q ; j++)
					a[i][j] = s.nextInt();
			System.out.println("enter the element of matrix b: ") ;
			for ( int i = 0 ; i < m ; i++)
				for ( int j = 0 ; j < n ; j++)
					b[i][j] = s.nextInt() ;
			System.out.println("matrix a:") ;
			for ( int i = 0 ; i < p ; i++) {
				for ( int j = 0 ; j < n ; j++)
					System.out.println("matrix b:" ) ;
				for ( int j = 0 ; j < n ; j++){
					for ( int j = 0 ; j < n ; j++)
						System.out.print(a[i][j]+b[i][j] + " " );
					System.out.println();
					
				}
			else {
					System.out.println("these matrix cannot be added..");
				}
			
		}
}
