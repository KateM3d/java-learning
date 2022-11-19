package week8;

import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.addFirst("JavaScript");
        languages.add("SQL");
        languages.add("C");
        languages.addLast("Python");


        System.out.println(languages);
        System.out.println("Without removal:");
        System.out.println("First element: " + languages.peekFirst() + " Last element: " + languages.peekLast());
        System.out.println("With removal:");
        System.out.println("First element: " + languages.pollFirst() + " Last element: " + languages.pollLast());
        System.out.println(languages);

    }

}
