package week12;

public class Raccoon extends AbstractAnimal {

    @Override
    void run() {
        System.out.println("I am a raccoon and I run");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("I am raccoon and I sleep");
    }

    @Override
    void eat() {
        super.eat();
    }
}
