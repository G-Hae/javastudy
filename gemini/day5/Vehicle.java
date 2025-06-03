package gemini.day5;

public abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("this brand is "+ brand+" and its speed is "+speed+"/km");
    }
    public void accelerate(int increment){
        speed += increment;
    }
     public void brake(int decrement){
        speed -= decrement;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}
