public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        double up = 1.75;
        double bottom = 76.7;
        double finalIndex = index.calculate(up, bottom);
        System.out.println(finalIndex);
    }
}
