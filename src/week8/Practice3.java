package week8;

import java.util.HashMap;
import java.util.LinkedList;

public class Practice3 {
    public static void main(String[] args){
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.addFirst("JavaScript");
        languages.add("SQL");
        languages.add("C");
        languages.addLast("Python");

        HashMap<Integer, String> langMap = new HashMap<>();

        for( int i=0; i<languages.size();i++){
            System.out.println(i);
            langMap.put(i, languages.get(i));
        }
        System.out.println(langMap);

    }
}
