package week12;

public abstract class AbstractAnimal {
    abstract void run();

    void sleep(){
        System.out.println("I am an animal and I sleep");
    }

    void eat(){
        System.out.println("I am an animal and I love to eat");
    }
}
