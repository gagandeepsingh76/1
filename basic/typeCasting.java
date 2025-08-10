public class typeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;  // Implicit casting

        double x = 9.78;
        int y = (int) x;  // Explicit casting

        System.out.println("Implicit (int to double): " + b);
        System.out.println("Explicit (double to int): " + y);
    }
}