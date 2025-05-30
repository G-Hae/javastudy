package gemini.day3;

public class Student {
    String name;
    int studentId;
    int grade;

    public Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void displayStudentInfo(){
        System.out.println("이름:" + name+ "학번:" +studentId + "학년: "+grade);
    }
}
