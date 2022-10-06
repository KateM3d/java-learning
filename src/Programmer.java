public class Programmer{
    String name;
    int age;

    public static void main (String[] args){
        Programmer anna = new Programmer();
        anna.name="Anna";
        anna.age=12;

        Programmer andrew=new Programmer();
        andrew.name="Andrew";
        andrew.age=27;

        System.out.println("Her name is " + anna.name);
        System.out.println("His name is " + andrew.name);
    }
}

