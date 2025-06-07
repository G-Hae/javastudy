package gemini.day05;

public class Car extends Vehicle implements Drivable {
    public Car(String brand, int speed){
        super(brand, speed);
    }

    @Override
    public void startEngine(){
        System.out.println("Start car's engine");
    }
    public void stopEngine(){
        System.out.println("Stop car's engine");
    }

    public void drive(){
       System.out.println("The car is driving");
    }

    public void turn(String direction){
       System.out.println("The car turns to " + direction);
    }    
}
