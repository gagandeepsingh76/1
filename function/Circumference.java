import java.util.*;
//Write a function that takes in the radius as input and returns the circumference of a circle.
public class Circumference {
    public static void printCircumference(Double r){
        Double Circumference = (2) * (3.14) * r;
        System.out.print(Circumference);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Double r= sc.nextDouble();
        printCircumference(r);
        System.out.print(" is circumference");
    }

}
