public class NestedLoops {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer: " + i); // Executes 5 times
            // Inner loop
            for (int j = 1; j <= 10; j++) {
            System.out.println(" Inner: " + j); // Executes 50 times (5 * 10)
            }
        }
    }
}
