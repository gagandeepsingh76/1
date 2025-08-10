import java.util.*;
//Print if a number is prime or not (Input n from the user). 
public class checkPrimeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean isPrime= true;
        if(n<=1){
            isPrime=false;
            System.out.println("Number is neither prime not composite");
            return;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime= false;
                
            }            
        }
    }
        if(isPrime){            
            System.out.println("This is a prime number");
        }
        
       else{
        System.out.println("This is not prime");
       } 
    }
}

        
    



