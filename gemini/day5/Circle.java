package gemini.day5;

public class Circle extends Shape {
    double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing " + color +"circle which has radius: " + radius);
    }
}
