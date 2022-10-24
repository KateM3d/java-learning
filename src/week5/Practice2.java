package week5;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("please enter a number>>");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();

        System.out.println(n%2==0 ? "Even" : "Odd");
    }
}
