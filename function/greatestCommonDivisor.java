import java.util.*;
//GCD is the greatest common factor of two or more numbers. A factor that is the highest among the numbers.
//Write a function that calculates the Greatest Common Divisor of 2 numbers.
public class greatestCommonDivisor {
    public static void greatestCommonDivisor(int a,int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        System.out.println("Greatest Common Divisor is : "+ gcd );
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        greatestCommonDivisor(a,b);

        
    }

}
