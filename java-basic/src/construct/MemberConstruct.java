package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
        System.out.println("이름:" + name + " 나이:" + age + " 성적:" + grade);
    }

    // 추가
    MemberConstruct(String name, int age, int grade) {
        System.out.println("이름:" + name + " 나이:" + age + " 성적:" + grade);
        this.name = name; // 자기 자신의 참조값
        this.age = age;
        this.grade = grade;
    }
}
