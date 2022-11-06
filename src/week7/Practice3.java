package week7;

import java.util.ArrayList;

public class Practice3 {
    // Создайте ArrayList из строк. Добавьте еще один целочисленный ArrayList,
    // в каждый элемент которого положите длину каждой строки строкового ArrayList.
    // Выведете оба списка на экран.
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("Hobbit");
        books.add("DaVinci Code");
        books.add("Alice in Wonderland");

        for(String el: books){
            System.out.println(el);
        }

        ArrayList<Integer> lengthsOfBook = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            lengthsOfBook.add((books.get(i)).length());
        }

        for (Integer el : lengthsOfBook) {
            System.out.println(el);
        }
    }
}
