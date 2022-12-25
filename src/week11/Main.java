package week11;

public class Main {
    public static void main(String[] args) {
        Fisherman andy = new Fisherman();
        Ship admiralNelson = new Ship();

        SwimExecutor executeSwim = new SwimExecutor();
        RestExecutor executeRest = new RestExecutor();

        executeSwim.makeSwim(andy);
        executeSwim.makeSwim(admiralNelson);
        executeRest.makeRest(andy);
        executeRest.makeRest(admiralNelson);
    }
}
