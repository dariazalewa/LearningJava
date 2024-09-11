public class Arrays {
    public static void main(String[] args) {
        String[] name = {"John","James","Tom","Franklin"};
        int[] age = {29,47,30,35};
        age[2] = 31;
        System.out.println(age.length);
        System.out.println("Name: " + name[0] +" \nAge: "+ age[2]);
    }
}
