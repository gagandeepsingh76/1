import java.util.*;
public class transposeIn2D {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows & column no.:");
        int rows= sc.nextInt();
        int column= sc.nextInt();
        System.out.println("Enter the elements:");
        int[][] matrix= new int[rows][column];
        int[][] transposeMatrix= new int[rows][column];
        for(int i=0;i<rows;i++){
             for(int j=0;j<column;j++){
                matrix[i][j]= sc.nextInt();
             }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix [i][j]+" ");
            }System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                transposeMatrix[j][i]=matrix[i][j];
            }  
        }
        System.out.println("Transpose of matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(transposeMatrix [i][j]+" ");
            }System.out.println();
    }
}
}