public class Programmer {
    String name;
    int age;
    static int count = 0;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String write(String writeType) {
        return " writes " + writeType;
    }

    public String drink(String drinkType) {
        return " drinks " + drinkType;
    }

    public static void main(String[] args) {
        Programmer anna = new Programmer("Anna", 25);

        Programmer andrew = new Programmer("Andrew", 27);

        System.out.println("Her name is " + anna.name);
        System.out.println("His name is " + andrew.name);
        System.out.println(count + " total programmers");
        System.out.println("Today " + anna.name + anna.write("code"));
        System.out.println("but " + andrew.name + andrew.drink("coffee"));
    }
}

