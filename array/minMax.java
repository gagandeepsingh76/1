import java.util.*;
//Find the maximum & minimum number in an array of integers.
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
public class minMax {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int integer[]= new int[size];
        for(int i=0;i<size;i++){
            integer[i]=sc.nextInt();
        }
        int max= Integer.MIN_VALUE;//Integer.MIN_VALUE represents the minimum possible value an integer can hold.
        //in max intially we stored the minimum value of integer so when we scan all the inputs all the max value will figure out. 
        int min= Integer.MAX_VALUE;//Integer.MAX_VALUE represents the maximum possible value an integer can hold.
        //same as in min we stored intially the maximum value.
        for(int i=0;i<size;i++){
            if(integer[i]<min){
                min=integer[i];
            }
            if(integer[i]>max){
                max=integer[i];

            }

        }
        System.out.println("Minimum no. is : "+min);
        System.out.println("Maximum no. is : "+max);


    }

}

