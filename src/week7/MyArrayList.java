package week7;


import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("rose");
        flowers.add("peony");

        for (String el : flowers) {
            System.out.println(el);
        }

        flowers.add(1, "lily");
        System.out.println("__________");

        for (String el : flowers) {
            System.out.println(el);
        }

        flowers.set(1, "forget-me-not");
        System.out.println("__________");

        for (String el : flowers) {
            System.out.println(el);
        }
    }
}
