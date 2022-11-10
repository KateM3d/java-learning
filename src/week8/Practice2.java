package week8;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String, String> tabNameAndLang = new HashMap<>();

        tabNameAndLang.put("JavaScript", "Kate");
        tabNameAndLang.put("Java", "Boris");
        tabNameAndLang.put("C#", "Jane");
        tabNameAndLang.put("SQL", "Alex");

        for (Map.Entry<String, String> element : tabNameAndLang.entrySet()) {
            System.out.println(element);
        }

        System.out.println(tabNameAndLang.keySet());
        System.out.println(tabNameAndLang.values());
    }
}
