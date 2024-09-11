public class MethodIfElse {
    static void checkHeight(int height) {
        if (height < 160) {
          System.out.println("You are not tall enough to ride a roller coaster!");
        } else {
          System.out.println("You are tall enough to ride a roller coaster!");
        }
      }
    
      public static void main(String[] args) {
        checkHeight(175); 
      }
}
