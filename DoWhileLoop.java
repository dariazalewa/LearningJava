public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 10;            /* do{...} while (condition); */
        do {
            System.err.println(n);
            n+=5;
        } while (n <= 50);
    }
}
