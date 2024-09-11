public class LogicalOperators {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n > 2 && n < 10);  //Logical and
        System.out.println(n > 2 || n < 10);  //Logical or
        System.out.println(!(n > 2 && n < 10));  //Logical not
    }
}
