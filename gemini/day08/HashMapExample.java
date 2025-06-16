package gemini.day08;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");
        dictionary.put("cherry", "체리");
        dictionary.put("apple", "빨간 사과");

        System.out.println("current dict: " + dictionary);

        System.out.println("apple meaning: " + dictionary.get("apple"));
        System.out.println("grape meaning: " + dictionary.get("grape"));

        System.out.println("is there banana?: " + dictionary.containsKey("banana"));
        System.out.println("is there 사과?: " + dictionary.containsValue("사과"));

        dictionary.remove("banana");
        System.out.println("after remove dict: " + dictionary);

        System.out.println("all keys in the dict");
        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }

        System.out.println("all values in the dict");
        for (String values : dictionary.values()) {
            System.out.println(values);
        }

        System.out.println("all entries in the dict");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

}
