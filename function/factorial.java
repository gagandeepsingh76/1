
import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        if(n<1){
            System.out.println("Invalid");
            return; 
            
        }
        int Factorial=1;
        for(int i=n;i>=1;i--){
            Factorial = Factorial*i;
        }
            System.out.print(Factorial);
        
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}


