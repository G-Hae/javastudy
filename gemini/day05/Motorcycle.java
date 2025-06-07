package gemini.day05;

public class Motorcycle extends Vehicle implements Drivable {
    public Motorcycle(String brand, int speed){
        super(brand, speed);
    }

    @Override
    public void startEngine(){
        System.out.println("Start Motorcycle's engine");
    }
    public void stopEngine(){
        System.out.println("Stop Motorcycle's engine");
    }

    public void drive(){
       System.out.println("The Motorcycle is driving");
    }

    public void turn(String direction){
       System.out.println("The Motorcycle turns to " + direction);
    }    
}
