import java.util.*;
public class makeCalculator {
    /*Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    char operator= sc. next().charAt(0);
    int b= sc.nextInt();
    switch(operator){
        case '+' : System.out.println(a+b);
        break;
        case '-' : System.out.println(a-b);
        break;
        case '*' : System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '%' : System.out.println(a%b);
        break;
    } 
}

}
