package gemini.day06;

import java.util.HashSet;

public class HastSetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
    
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        System.out.println(colors);

        colors.remove("blue");
        System.out.println(colors);
        System.out.println("is green in the list? " + colors.contains("green"));
        System.out.println("remain");
        
        for (String color:colors){
            System.out.println(color);
        }
    }
}
