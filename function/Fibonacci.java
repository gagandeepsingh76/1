import java.util.*;
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 

public class Fibonacci {
    public static void fibonacci(int n){
        int firstTerm=0;
        int secondTerm=1;
        
        
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm+" ");
            int nextTerm= firstTerm + secondTerm ;
            firstTerm= secondTerm;
            secondTerm= nextTerm;
        }
        

    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    fibonacci(n); 

    }
}
