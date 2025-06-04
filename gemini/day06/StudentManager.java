package gemini.day06;

import java.util.ArrayList;

public class StudentManager {
    class Student{
        String name;
        int age;
        String major;
        public Student(String name, int age, String major){
            this.name = name;
            this.age = age;
            this.major=major;
        }
        public void displayInfo(){
            System.out.println("name: "+name + ", age: "+age + ", major: "+major);
        }
    }
    private ArrayList<Student> studentList;
    public StudentManager(){
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void displayAllStudents(){
        for(Student student:studentList){
            student.displayInfo();
        }
    }

    public Student findStudent(String name){
        for(Student student: studentList){
            if(student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(manager.new Student("sofia", 32, "Poli-sci"));
        manager.addStudent(manager.new Student("Jack", 15, "Computer"));
        manager.addStudent(manager.new Student("Daniel", 50, "Chemical"));
        manager.addStudent(manager.new Student("Sam", 24, "Medicine"));

        System.out.println("-----------all student info--------");
        manager.displayAllStudents();

        System.out.println("-----------jenni info--------");
        Student jenni = manager.findStudent("Jenni");
        if(jenni==null){
            System.out.println("no info");
        } else{
            jenni.displayInfo();
        }

        System.out.println("-----------Daniel info--------");
        Student danny = manager.findStudent("Daniel");
        if(danny==null){
            System.out.println("no info");
        } else{
            danny.displayInfo();
        }

    }
}

