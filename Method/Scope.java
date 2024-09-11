public class Scope {
    public static void main(String[] args) {
        {                    // <-
          int v = 15000;     // Code only inside this block can use v
          System.out.println(v);
        }                    // <-
      }
}
