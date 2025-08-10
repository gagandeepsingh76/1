import java.util.Scanner;

public class hollobutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // Print the upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Check for first and last row/column and the character at the center
                if (i == 1 || j == 1 || i == n || j == n || (i == n / 2 && j == n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the lower half of the butterfly (mirrored)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || (i == n / 2 && j == n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}