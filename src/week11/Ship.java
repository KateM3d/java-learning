package week11;

public class Ship implements Swimmable, Restable {
    @Override
    public void swim() {
        System.out.println("This is a ship");
        fuel();
        rest();
    }

    private void fuel() {
        System.out.println("I'm getting a fuel");
    }

    @Override
    public void rest() {
        System.out.println("Unavailable due to a scheduled service check");
    }
}
