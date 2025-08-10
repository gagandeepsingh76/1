import java.util.*;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
public class power {
    public static void power(int x, int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*x;
        }
        System.out.println(a);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        power(x, n);

    }

}
