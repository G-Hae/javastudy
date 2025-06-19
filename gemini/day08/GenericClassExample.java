package gemini.day08;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("apple");

        Box<Integer> intBox = new Box<>(); // Integer 타입만 담는 박스
        intBox.setItem(123);
        Integer num = intBox.getItem();
        System.out.println("정수 박스: " + num);

    }
}
