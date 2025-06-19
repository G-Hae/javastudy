package gemini.day08;

public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        String[] strings = { "hello", "world", "generics" };
        Integer[] integers = { 1, 2, 3, 4, 5 };
        printArray(strings);
        printArray(integers);

    }

}
