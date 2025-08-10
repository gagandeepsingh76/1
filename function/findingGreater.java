import java.util.*;
//Write a function which takes in 2 numbers and returns the greater of those two.
public class findingGreater {
    public static void printGreater(int a ,int b){
       /* if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }*/
        String result= (a>b)? "a is greater":"b is greater";
        System.out.println(result);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        printGreater(a,b);
    }
}


