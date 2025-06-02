package gemini.day4;

public class EncapsulationExample {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Sonata", 200);
        System.out.println(myCar.getColor());
        myCar.setMaxSpped(300);
        myCar.showInfo();
    }
}
