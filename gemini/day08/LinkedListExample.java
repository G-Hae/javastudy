package gemini.day08;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> toDoList = new LinkedList<>();

        toDoList.add("자바 공부하기");
        toDoList.add("저녁 준비하기");
        toDoList.add(0, "운동하기");

        System.out.println("현재 할 일 목록: " + toDoList);

        toDoList.remove(1);
        System.out.println("수정된 할 일 목록: " + toDoList);

        System.out.println("첫번째 할 일" + toDoList.get(0));

        LinkedList<String> stackExample = new LinkedList<>();
        stackExample.push("1");
        stackExample.push("2");
        stackExample.push("3");

        System.out.println("스택: " + stackExample);
        System.out.println("팝: " + stackExample.pop());
        System.out.println("남은 스택: " + stackExample);

        LinkedList<String> queExample = new LinkedList<>();
        queExample.offer("1");
        queExample.offer("2");
        queExample.offer("3");

        System.out.println("스택: " + queExample);
        System.out.println("팝: " + queExample.poll());
        System.out.println("남은 스택: " + queExample);
    }

}
