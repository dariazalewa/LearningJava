public class MethodReturnValues {
    static int mathCalculation (int l) {
        return 4 * l;
    }

    static int mathCalculation2 (int k, int j) {
        return k/j;
    }

    public static void main(String[] args) {
        System.out.println(mathCalculation(3));
        int m = mathCalculation2(144,2);
        System.out.println(m);
    }
}
