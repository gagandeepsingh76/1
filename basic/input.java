import java.util.*;
class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        // Float input
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        // Double input
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Character Input
        System.out.print("Enter your grade (A/B/C): ");
        char grade = input.next();

        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
    }
}