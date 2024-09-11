public class MultidimensionalArraysLoop {
    public static void main(String[] args) {
        String[][] names = {{"Janusz","Mikołaj","Antek"}, {"Aleksandra","Julia","Michalina"}};
        for (int n = 0; n < names.length; ++n){
            for (int m = 0; m < names[n].length; ++m) {
                System.out.println(names[n][m]);
            }
        }
    }
}
