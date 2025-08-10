import java.util.*; 
public class reverseString {
    public static void main(String args[]){
//If we want to take input from user then we will use this method
         // Create a Scanner object for user input(this method till next comment will use everytime to taking the input in string builder))
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input= sc.nextLine();
        StringBuilder sb= new StringBuilder(input);
         // Reverse the string using StringBuilder's reverse method
        String reverseString= sb.reverse().toString();
        // Print the reversed string
        System.out.println("Reversed String: " + reverseString);
    }
} 
/*
method 1
        //if we dont want to take input from user then we will use this method
    public class reverseString {
    public static void main(String args[]){
        // Initialize the string using StringBuilder
        StringBuilder sb = new StringBuilder("hello");

        // Reverse the string using StringBuilder's reverse method
        //String reversedString = sb.reverse().toString();
        sb.reverse();

        // Print the reversed string
        System.out.println("Reversed String: " + sb);
    }
}
 


 
 // method 3
  public class reverseString {
  public static void main(String args[]){
    //if we want to reverse the string without using reverse string method then just remove the string builder line  
         //Scanner sc= new Scanner(System.in);
         //String input= sc.nextLine();
         StringBuilder input= new StringBuilder("hello");
         for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
         }
        }}//in this we can also add input taking code from 1st method*/