package week6;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        System.out.println("Please enter number>>");
        Scanner intFactorial = new Scanner(System.in);
        int n = intFactorial.nextInt();
        int m=1;

        for (int i = 1; i <= n; i++) {
            m = m * i;
        }
        System.out.println(m);
    }
}
