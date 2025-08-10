import java.util.*;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class count {
    public static void main(String[] args) {
        int positive = 0, negative =0, zero = 0;        
        Scanner sc= new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a number :");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Press 1 to continue");
            input=sc.nextInt();
        }
        while(input==1);
        System.out.println("Total positive number are:"+ positive);
        System.out.println("Total negative number are:"+ negative);
        System.out.println("Total zeros are:"+ zero);
        
       
    }
}


