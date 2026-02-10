package OOPLAB;
import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[]args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows in Matrix A");
		p=s.nextInt();
		System.out.print("Enter number of columns in Matrix A");
		q=s.nextInt();
		System.out.print("Enter number of rows in Matrix B");
		m=s.nextInt();
		System.out.print("Enter number of columns in Matrix B");
		n=s.nextInt();
		if(p==m && q==n) {
			int a[][]= new int[p][q];
			int b[][]= new int[m][n];
			System.out.print("Enter the elements in Matrix A");
			for(int i=0;i<p;i++) {
				for(int j=0;i<q;j++) {
					a[i][j]=s.nextInt();
				}
			}
			System.out.print("the Matrix A");
			for(int i=0;i<p;i++) {
				for(int j=0;i<q;j++) {
					System.out.print(a[i][j]+"");
				}
			}
			System.out.print("Enter the elements in Matrix B");
			for(int i=0;i<m;i++) {
				for(int j=0;i<n;j++) {
					b[i][j]=s.nextInt();
				}
			}
			System.out.print("the Matrix B");
			for(int i=0;i<m;i++) {
				for(int j=0;i<n;j++) {
					System.out.print(b[i][j]+"");
				}
			}
			System.out.print("Sum Matrix ");
			for(int i=0;i<m;i++) {
				for(int j=0;i<n;j++) {
					System.out.print(a[i][j]+b[i][j]+"");
				}
			}
		}
	
		else {
			System.out.print("These matrix cannot be added ");
		}
	}
}
		
	
	
	





