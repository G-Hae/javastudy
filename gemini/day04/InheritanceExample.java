package gemini.day04;

public class InheritanceExample {
    public static void main(String[] args) {
        Person person = new Person("Jack", 22);
        person.introduce();

        System.out.println("-----------------");

        Student student = new Student("Derek", 21, "Computer Engineering");

        student.introduce();
        student.study();

        Person anotherPerson = new Student("Jenni", 24, "Politics");
        anotherPerson.introduce();

    }
}
