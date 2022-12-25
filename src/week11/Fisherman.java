package week11;

public class Fisherman implements Swimmable, Restable {
    @Override
    public void swim() {
        System.out.println("This is mr Fisherman and he can swim!");
        eat();
        sing();
        fish();
    }

    private void eat() {
        System.out.println("I'm eating");
    }

    private void sing() {
        System.out.println("I'm singing fisherman's song now");
    }

    private void fish() {
        System.out.println("I'm fishing");
    }

    @Override
    public void rest() {
        System.out.println("I'm resting");
    }
}
