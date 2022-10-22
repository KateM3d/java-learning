public class Car {
    String color;
    String made;

    public Car() {

    }

    public Car(String made, String color) {
        this.color = color;
        this.made = made;
    }

    static String stop(String stopMessage) {
        return stopMessage;
    }

    static void newStop() {
        System.out.print(" make new stop ");
    }
    static void newStopTwo() {
        System.out.print(" make new second stop ");
    }

    ;

    static void newGo() {
        System.out.print(" you can go faster!");
    }

    static String proceed(String proceedMessage) {
        return proceedMessage;
    }

    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "white");
        Car hyndai = new Car("Hyndai", "blue");
        Car bmw = new Car();
        bmw.color = "green";
        bmw.made = "bmw";

        System.out.println(toyota.made + " with the color " + toyota.color);
        System.out.println(hyndai.made + " with the color " + hyndai.color);
        System.out.println(toyota.made + " please " + toyota.stop("stop at the red light"));
        System.out.println(hyndai.made + " please " + hyndai.proceed("proceed at the green light"));
        System.out.println(bmw.made + " created with the other constructor " + " color " + bmw.color + " ");
        bmw.newStop();
        bmw.newGo();
    }

}
