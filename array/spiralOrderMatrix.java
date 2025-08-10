import java.util.*;
public class spiralOrderMatrix {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    // Input matrix dimensions
    System.out.println("Enter the rows and column number:");
    int rows= sc.nextInt();
    int col= sc.nextInt();

    // Input matrix elements
    System.out.println("Enter the elements:");
    int[][] matrix= new int[rows][col];
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]= sc.nextInt();
        }
    }

    //output matrix
    System.out.println("The matrix is:");
    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

     // Initialize boundaries
    int rowStart=0;
    int rowEnd= rows-1;
    int colStart= 0;
    int colEnd= col-1;

    System.out.println("Spiral order traversal:");
    // Traverse the matrix in spiral order
    while(rowStart <= rowEnd && colStart <= colEnd){

        //we will traverse in the row row_start from column_start to column_end and we will increase the row_start with 1 
        for(int j=colStart;j<=colEnd;j++){
            System.out.print(matrix[rowStart][j]+" ");
        }
        rowStart++;
        
        //we will traverse in the column column_end from row_start to row_end and decrease the column_end by 1.
        if (rowStart <= rowEnd){        
        for(int i=rowStart;i<=rowEnd;i++){
            System.out.print(matrix[i][colEnd]+" ");
        }
        colEnd--;
    }

        //we will traverse in the row row_end from column_end to column_start and decrease the row_end by 1.
        if(colStart<=colEnd){
        for(int j=colEnd;j>=colStart;j--){
            System.out.print(matrix[rowEnd][j]+" ");
        }
        rowEnd--;
    }

        //we will traverse in the column column_start from row_end to row_start and increase the column_start by 1.
        if(rowStart<=rowEnd){
        for(int i=rowEnd;i>=rowStart;i--){
            System.out.print(matrix[i][colStart]+" ");
        }
        colStart++;
    }
 }
 sc.close();
}
}
