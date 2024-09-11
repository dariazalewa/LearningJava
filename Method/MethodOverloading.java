public class MethodOverloading {
    static int multiMethod(int a, int b) {
        return a * b;
      }
      
      static double multiMethod(double a, double b) {
        return a * b;
      }
      
      public static void main(String[] args) {
        int nr1 = multiMethod(8, 5);
        double nr2 = multiMethod(5.75, 2.62);
        System.out.println("int: " + nr1);
        System.out.println("double: " + nr2);
      }
}
