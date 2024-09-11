public class Recursion {
    public static void main(String[] args) {
        int result = sum(16);
        System.out.println(result);
    }

    public static int sum(int k) {   /* Recursion provides a way to break complicated problems down into simple problems which are easier to solve. */
        if (k > 0) {
          return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
