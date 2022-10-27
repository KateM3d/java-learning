package week6;

import java.util.Random;

public class Loops {

    public static void main(String[] args) {
        int i = 0;
        for (int g = 200;
             i < 5 && g != 67; ++i, g--) {
            System.out.println(i);
        }

        System.out.println(i);
//        int i;
//
//        do {
//            i = new Random().nextInt();
//            System.out.println(i);
//            i++;
//        } while (i < 5);

    }
}
