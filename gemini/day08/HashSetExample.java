package gemini.day08;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> uniqueNumbers = new HashSet<>();

        uniqueNumbers.add("1");
        uniqueNumbers.add("2");
        uniqueNumbers.add("3");
        uniqueNumbers.add("3");

        System.out.println("현재 Set: " + uniqueNumbers);
        System.out.println("현재 Set size: " + uniqueNumbers.size());
        System.out.println("has two in the Set?: " + uniqueNumbers.contains("2"));
        uniqueNumbers.remove("3");
        System.out.println("after remove Set: " + uniqueNumbers);

        System.err.println("every element in Set");
        for (String string : uniqueNumbers) {
            System.out.println(string);
        }

    }

}
