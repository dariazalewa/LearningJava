public class MethodParameters {
    static void myMethod(String firstName) {   //firstName is a parameter
        System.out.println(firstName + " Nowak");
    }

    public static void main(String[] args) {
        myMethod("Andrzej");   // Andrzej, Monika and Alex are arguments
        myMethod("Monika");
        myMethod("Alex");
    }
}
