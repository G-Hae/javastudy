package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name; // 자기 자신의 참조값
        this.age = age;
        this.grade = grade;
    }
}
