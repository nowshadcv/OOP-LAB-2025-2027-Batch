package OOPLAB;

import java.util.Scanner;
public class MatrixAdd {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows in matrix A");
		p=s.nextInt();
		System.out.print("Enter mnber of columns of A");
		q=s.nextInt();
		System.out.println("Enter num of rows for B");
		m=s.nextInt();
		System.out.print("enter num of clmns for b");
		n=s.nextInt();
		if(p==m && q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("enter the elmts of matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("entr elmnts of B");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++){
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();}
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
			System.out.println();
			}
			System.out.println("The sum matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(a[i][j]+b[i][j]+" ");
				System.out.println();
			}
		}
		else {
			System.out.println("these matrices cannot be added");
		}
			
		}
}
