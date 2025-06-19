package gemini.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("alice");
        // names.add(123);

        Map<String, Integer> studentScores = new HashMap();
        studentScores.put("john", 90);
        studentScores.put("철수", 90);
        studentScores.put("영희", 85);

        int cheolsuScore = studentScores.get("철수"); // Integer -> int 자동 언박싱
        System.out.println("철수 점수: " + cheolsuScore);

    }

}
