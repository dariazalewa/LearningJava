public class ForEachLoop {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"}; //A "for-each" loop is used exclusively to loop through elements in arrays (or other data sets).
        for (String c : colors) {       /* for (type variableName : arrayName)  {...} */
        System.out.println(c);
        }
    }
}
