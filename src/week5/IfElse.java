package week5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.print("Type a number>> ");
        Scanner inputInt = new Scanner(System.in);
        int a = inputInt.nextInt();

        if (a == 5) {
            System.out.println("a=5");
        }

        System.out.println("Multiply by 2");
        System.out.println("a = " + (a *= 2));
    }
}
