package gemini.day08;

import java.util.ArrayList;

public class NonGenericExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("hello");
        list.add(123);
        list.add(true);

        Object obj1 = list.get(0);
        String s = (String) obj1;
        Object obj2 = list.get(1);
        String s2 = (String) obj2;
        System.out.println(s + s2);

    }

}
