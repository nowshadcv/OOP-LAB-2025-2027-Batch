package mca_s2_27;

import java.util.Scanner;
public class MatrixAddition {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner (System.in);
		System.out.print("enter number of rows in matrix a : ");
		p=s.nextInt();
		System.out.print("enter number of clomns in matrix a : ");
		q=s.nextInt();
		System.out.print("enter number of rows in martix b :");
		m=s.nextInt();
		System.out.print("enter number of columns in matrix b : ");
		n=s.nextInt();
		
		if (p == m && q == n) {
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			
			System.out.println("enter the elements of martix a : ");
			for (int i = 0;i <p ;i ++)
				for (int j=0;j<q ;j++)
					a[i][j] = s.nextInt();
			
			System.out.println("enter the elements of martix b :");
			for (int i =0;i<m ;i++)
				for(int j =0;j <n;j++)
					b[i][j] = s.nextInt();
			
			System.out.println("martix a :");
			for (int i =0;i<p ;i++) {
				for(int j =0;j <q;j++)
					System.out.print(a[i][j] + "  ");
				System.out.println() ; }
		
			System.out.println("martix b :");
			for (int i =0;i<m ;i++) {
				for(int j =0;j <n;j++)
					System.out.print(b[i][j] + "  ");
				System.out.println() ; }
		
			System.out.println("the sum martix :");
			for(int i =0;i<m ;i++) {
				for(int j =0;j <n;j++)
					System.out.print(a[i][j] + b[i][j] +"  ");
				System.out.println() ; }
			}
			else {
				System.out.println("these matrices cannot be added.. ");}
			}
	}

