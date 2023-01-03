package week12;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        GoldFish goldFish = new GoldFish();
        Raccoon raccoon = new Raccoon();
        Lion lion = new Lion();

        zookeeper.doSleep(goldFish);
        zookeeper.doSleep(lion);
        zookeeper.doSleep(raccoon);

        zookeeper.doEat(goldFish);
        zookeeper.doEat(lion);
        zookeeper.doEat(raccoon);

        zookeeper.doRun(goldFish);
        zookeeper.doRun(lion);
        zookeeper.doRun(raccoon);

    }
}
