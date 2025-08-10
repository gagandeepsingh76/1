import java.util.*;
/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
 */
public class marks {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int input;
    do{
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        if(marks >=90){
            System.out.println("This is Good");
        }
        else if(89 >= marks && marks>= 60){
            System.out.println("This is also Good");
        }
        else{
            System.out.println("This is Good as well");
        }
        System.out.println("Enter 1 to continue");
        input= sc.nextInt();
    }
    while(input==1);
        
    }
}

