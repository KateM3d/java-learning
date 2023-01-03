package week12;

public class Zookeeper {
 void doSleep(AbstractAnimal abstractAnimal){
     System.out.println("I am a zookeeper and I ask you to fall asleep");
     abstractAnimal.sleep();
 }
    void doEat(AbstractAnimal abstractAnimal){
        System.out.println("I am a zookeeper and I ask you to eat");
        abstractAnimal.eat();
    }
    void doRun(AbstractAnimal abstractAnimal){
        System.out.println("I am a zookeeper and I ask you to run");
        abstractAnimal.run();
    }
}
