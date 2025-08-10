import java.util.*;
public class searchIn2DArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int rows= sc.nextInt();
        int col= sc.nextInt();
        System.out.println("Enter the elements of the array");       
        double [][] num= new double[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                num[i][j]= sc.nextInt();                
            }
        }
        System.out.println("The array is:");  
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(num[i][j]+"("+i+","+j+")"+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the x");
        double x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==x){
                    System.out.print("x is found at ("+i+","+j+")");
                }
            }
        }
    }
}
