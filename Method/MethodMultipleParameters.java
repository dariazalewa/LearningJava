public class MethodMultipleParameters {
    static void mySchool(String schoolSubject, int classroom) {   //firstName is a parameter
        System.out.println(schoolSubject + "is in " + classroom);
    }
    
    public static void main(String[] args) {
        mySchool("Biology", 67);   // Andrzej, Monika and Alex are arguments
        mySchool("PE", 55);
        mySchool("Mathematics", 60);
    }
}
