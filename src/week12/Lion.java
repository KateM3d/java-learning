package week12;

public class Lion extends AbstractAnimal{
    @Override
    void run() {
        System.out.println("I am lion and I run sometimes");
    }

    @Override
    void sleep(){
        super.sleep();
        System.out.println("I am a lion and I sleep a lot");
    }
    @Override
    void eat(){
        super.eat();
        System.out.println("I am lion and I eat once a day");
    }
}
