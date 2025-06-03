package gemini.day5;

public class Bird implements Flyable{
    String name;
    public Bird(String name){
        this.name = name;
    }
    @Override
    public void fly(){
        System.out.println(name + " is flying now");
    }
    @Override
    public void land(){
        System.out.println(name + "is landing now.");
    }
}
