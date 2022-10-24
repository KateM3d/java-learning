package week5;

import java.util.Scanner;

enum Season {WINTER, SPRING, SUMMER, AUTUMN}

public class SwitchCase {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case AUTUMN:
                System.out.println("It's Autumn now");
                break;
            case WINTER:
                System.out.println("It's Winter now");
                break;
            case SPRING:
                System.out.println("It's Spring now");
                break;
            case SUMMER:
                System.out.println("It's Summer finally!");
                break;
            default:
                System.out.println("Be well!");
        }
    }
}
