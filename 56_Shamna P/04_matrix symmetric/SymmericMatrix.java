package matrix;
import java.util.Scanner;
public class SymmericMatrix {
	public static void main(String[]args) {
		Scanner sc =new Scanner (System .in);
		System.out.println("ENTER THE NO OF ROWS:");
		int rows=sc.nextInt();
		System.out.println("ENTER THE NO OF columns:");
		int cols=sc.nextInt();
		int matrix[][]=new int [rows][cols];
		System.out.println("ENTER THE ELEMENTS OF MATRIX::");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				matrix[i][j]=sc.nextInt();
		sc.close();
		System.out.println("THE GIVEN MAREIX:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
	}
       if(rows!=cols)
    	   System.out.println("THE GIVEN MATRIX IS NOT A SQUARE MATRIX");
       else {
    	   boolean symmetric=true;
    	   for(int i=0;i<rows;i++)
   			   for(int j=0;j<cols;j++)
   			if (matrix[i][j]!=matrix[j][i]) {
   				symmetric=false;
   				break;
       }
    	   if(symmetric)
    		   System.out.println("THE GIVEN MATRIX IS SYEMMETRIC");
    	   else
    		   System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
       }
	}
    		   
}
