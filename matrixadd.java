package pgm3;
import java.util.Scanner;
public class matrixadd {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner (System.in);
		System.out.print("enter 0f rows in matrix A:");
		p=s.nextInt();
		System.out.print("enter 0f columnss in matrix A:");
		q=s.nextInt();
		System.out.print("enter 0f rows in matrix B:");
		m=s.nextInt();
		System.out.print("enter 0f columnss in matrix B:");
		n=s.nextInt();
		
		if (p==m&&q==n) {
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			System.out.println("enter 0f rows in matrix A:");
			for (int i = 0 ; i < p ; i++)
				for(int j =0 ; j < q ; j++)
					a[i][j] = s.nextInt();
			System.out.println("enter the elements  0f matrix B:");
			for (int i = 0 ; i < m ; i++)
				for(int j =0 ; j < n ; j++)
					b[i][j] = s.nextInt();
			System.out.println("matrix A:");
				for (int i = 0 ; i < p ; i++) {
					for(int j =0 ; j < q ; j++)
						System.out.println(a[i][j]+ " ");
					System.out.println();}
			System.out.println("matrix B:");
			for (int i = 0 ; i < m ; i++) {
				for(int j =0 ; j < n ; j++)
					System.out.println(b[i][j]+ " ");
				System.out.println() ;}
			System.out.println("the sum matrix:"); 
			for (int i = 0 ; i < m ; i++) {
				for(int j =0 ; j < n ; j++)
					System.out.println((a[i][j]+b[i][j])+ " ");
				System.out.println();}
		}
		else {
			System.out.println("these matrix cannot be added..");}
		
		}
		
		
		
	}
