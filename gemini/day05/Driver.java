package gemini.day05;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your car?");
        String brand = scanner.nextLine();
        System.out.println("What's your speed?");
        int speed = scanner.nextInt();
        scanner.nextLine();

        Car myCar = new Car(brand, speed);
        myCar.startEngine();
        myCar.accelerate(50);
        myCar.displayInfo();
        myCar.drive();
        myCar.turn("right");
        myCar.brake(20);
        myCar.displayInfo();
        myCar.stopEngine();

        System.out.println("What's your motorcycle?");
        String motorBrand = scanner.nextLine();
        System.out.println("What's your motorcycle's speed?");
        int motorSpeed = scanner.nextInt();
        scanner.nextLine();

        Motorcycle myMotorcycle = new Motorcycle(motorBrand, motorSpeed);
        scanner.close();

        Drivable[] drivableVehicles = {myCar, myMotorcycle};

        for(Drivable vehicle: drivableVehicles){
            vehicle.drive();
        }

        System.out.println("\n--- Vehicle 배열을 통한 정보 출력 ---");
        Vehicle[] vehiclesArray = {myCar, myMotorcycle}; // Vehicle 타입 배열
        for (Vehicle v : vehiclesArray) {
            v.displayInfo(); // Vehicle이 가진 displayInfo() 호출 (자식 객체의 정보가 출력됨)
        }

    }
    
}
