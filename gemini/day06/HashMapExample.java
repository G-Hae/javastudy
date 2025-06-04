package gemini.day06;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");
        dictionary.put("cherry", "체리");
        dictionary.put("apple", "빨간 사과");
        System.out.println("current Dict" + dictionary);

        System.out.println("meaning of apple" + dictionary.get("apple"));

        dictionary.remove("banana");
        System.out.println("current Dict" + dictionary);
        System.out.println("current Dict has apple?" + dictionary.containsValue("사과"));
        System.out.println("current Dict has 사과?" + dictionary.containsKey("apple"));

        System.out.println("keys of dict");
        for (String key: dictionary.keySet()){
            System.out.println("key" + key);
        }

        System.out.println("values of dict");
        for (String value: dictionary.values()){
            System.out.println("key" + value);
        }

        System.out.println("key & values of dict");
        for (java.util.Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }

    
}
