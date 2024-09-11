public class IfElse {
    public static void main(String[] args) {
        int x = 20;
        int y = 25;
        if(x == y) { /* !! if is in lowercase letters. If or IF will generate an error !! */
            System.out.println("Good");
        } else if (x > y){
            System.out.println("Not bad");
        } else {
            System.out.println("Definitely no");
        }
    }
}
