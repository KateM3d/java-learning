package week5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Please enter a temperature>>");
        Scanner intTemp = new Scanner(System.in);
        int t = intTemp.nextInt();

        if (t < 0) {
            System.out.println("It's very cold!");
        } else if (t > 0 && t < 16) {
            System.out.println("It's chilli!");
        } else {
            System.out.println("It's a beautiful day today!");
        }
    }
}
