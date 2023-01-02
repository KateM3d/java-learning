package week12;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        GoldFish goldFish = new GoldFish();
        Raccoon raccoon = new Raccoon();
        Lion lion = new Lion();

        zookeeper.doSleep(goldFish);
        zookeeper.doEat(lion);
        zookeeper.doRun(raccoon);

        zookeeper.doSleep(goldFish);
        zookeeper.doEat(lion);
        zookeeper.doRun(raccoon);

        zookeeper.doSleep(goldFish);
        zookeeper.doEat(lion);
        zookeeper.doRun(raccoon);

    }
}
