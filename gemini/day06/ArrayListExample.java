package gemini.day06;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("current fruits list: "+fruits);
        System.out.println("2nd fruits: "+ fruits.get(1));
        fruits.remove(0);
        System.out.println("after delete apple: "+ fruits);
        fruits.remove("orange");
        System.out.println("after delete orange: "+ fruits);
        System.out.println("number of remain fruits: "+ fruits.size());
        System.out.println("remain fruits: ");
        for(String fruit: fruits){
            System.err.println(fruit);
        }

        System.out.println("Is there a banana in the list?: " + fruits.contains("banana"));
        fruits.clear();
        System.out.println("after delete all: "+ fruits);
    }
}
