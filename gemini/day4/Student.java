package gemini.day4;

class Student extends Person {
    String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }
    
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("major: "+ major);
    }

    public void study(){
        System.out.println(name+" is studying " + major);
    }
    
}
