package week5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.print("Type a number>> ");
        Scanner inputInt = new Scanner(System.in);
        int a = inputInt.nextInt();

        if (a == 5) {
            System.out.println("a=5");
        } else if (a == 3 || a == 4) {
            System.out.println("a=3 or a=4");
        } else {
            System.out.println("the number you entered does not equal 3,4 or 5");
        }

        System.out.println("Multiply by 2");
        System.out.println("a = " + (a *= 2));
    }
}
