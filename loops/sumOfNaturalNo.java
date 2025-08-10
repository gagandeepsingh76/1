import java.util.*;

public class sumOfNaturalNo {
    //sum of first n natural no. means if n=5 then print the sum of (1+2+3+4+5)=15
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        //for loop
        /*for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            
        }
        System.out.println(sum);*/
        //while loop
        /*int i=1;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);*/
        //do while loop
        int i=1;
        do { 
            sum=sum+i;
            i++;
        } while (i<=n);
        System.out.println(sum);


    }
 }


