public class MultidimensionalArraysForEachLoop {
    public static void main(String[] args) {
        String[][] names = {{"Janusz","Mikołaj","Antek"}, {"Aleksandra","Julia","Michalina"}};
        for (String[] row : names) {
            for (String n : row){
                System.out.println(n);
            }
        }
    }
}
