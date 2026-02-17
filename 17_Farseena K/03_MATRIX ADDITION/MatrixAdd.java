package OOPLAB;
import java.util.Scanner;
public class MatrixAdd {
	public static void main(String args[])
	{
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter no.of rows in matrixA:");
		p=s.nextInt();
		System.out.print("enter no.of columns of matrixA:");
		q=s.nextInt();
		System.out.print("enter no.of rows in matrixB:");
		m=s.nextInt();
		System.out.print("enter no.of  of columns in matrixB:");
		n=s.nextInt();
		if(p==m&&q==n)
		{
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("enter elements of A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("enter the elements of matrixB:");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			System.out.println("MatrixA:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("MatrixB:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+"");
		System.out.println();	
	}
	System.out.println("Sum of matrix:");
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			System.out.print(a[i][j]+b[i][j]+" ");
	System.out.println();
}
else
{
	System.out.println("these matrices cannot be added");
}
}}