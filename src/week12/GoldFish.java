package week12;

public class GoldFish extends AbstractAnimal{
    @Override
    void run() {
        System.out.println("I am goldfish and I don't run");
    }
    @Override
    void sleep(){
        super.sleep();
    }
    @Override
    void eat(){
        System.out.println("I am goldfish and I eat");
    }
}
