package MODULE_1;
import java.util.Scanner;

public class matrixsymmetry{
	public static void main(String[] args) {
		
		int rows,cols;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number of rows in matrix: ");
		rows=s.nextInt();
		
		System.out.print("Enter number of column in matrix: ");
		cols=s.nextInt();
		
		int matrix[][] =new int [rows][cols];
		
		System.out.println("Enter the element of matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		
		System.out.println("The Entered the element of matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		s.close();
		
		
		if(rows!=cols){
			System.out.println("the given matrix is not Square Matrix:");
		}
		
		
		
		else {
			boolean symmetric= true ;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(matrix[i][j]!=matrix[j][i])
					{
						symmetric=false;break;
					}
				}
			}
			
			if(symmetric) {
				System.out.println("The given matrix is Symmetric");
			}
			else {
				System.out.println("The given matrix is not symmetric");
			}
		}
		
		
			
	}
}
		
		