import java.util.*;
//Take an array of numbers as input and check if it is an array sorted in ascending order.
public class ascendingOrder {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int size= sc.nextInt();
      int number[]= new int[size];  
      for(int i=0;i<size;i++){
       number[i]= sc.nextInt();
      }
      boolean isAscending= true;
      // Initializes a boolean variable isAscending and assumes the array is sorted initially.
      for(int i=0;i<size-1;i++){
        if(number[i]>number[i+1]){
          isAscending= false;
        }
        /*Inside the loop, it compares the current element (number[i]) with the next element (number[i+1]).
         If the current element is greater than the next, it means the order is broken, so isAscending is set to false. */
      }
      if(isAscending){
        //if isAscending is true then if condition will satify and if not satify then it move to else part.
        System.out.println("The array is sorted in ascending order");
      }
      else{
        System.out.println("The array is not sorted in ascending order");
      }

    }
}


