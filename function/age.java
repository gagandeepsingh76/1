import java.util.*;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
public class age {
    public static void findingEligibility(int age){
        if(age>18){
            System.out.println("Person is eligible");
        }
        else{
            System.out.println("Person is not elibile");
        }
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int age =sc.nextInt();
       findingEligibility(age); 
    }
}


