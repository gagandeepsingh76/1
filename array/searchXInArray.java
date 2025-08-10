import java.util.*;
public class searchXInArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int array[]= new int[size];
        //scanning loop
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
            
        }
        int x= sc.nextInt();
        //searching loop
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                System.out.println("x is found at index"+i);
            }
        }

    }

}
