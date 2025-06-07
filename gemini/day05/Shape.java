package gemini.day05;

public abstract class Shape {
    String color;
    
    public Shape(String color){
        this.color = color;
    }

    public void displayColor(){
        System.out.println("color of shape: "+ color);
    }

    public abstract double calculateArea();
    public abstract void draw();

}
