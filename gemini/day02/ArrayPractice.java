package gemini.day02;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25};
        int total = 0;

        for(int number:numbers){
            total+= number;
        }
        System.out.println(total);

        String[] fruits = {"딸기","파인애플", "수박"};
        for(int i=0; i<fruits.length; i++){
        System.out.println("fruits["+i+"]: "+fruits[i]);
        }

        double[] temperatures = {23.5, 28.1, 26.0, 30.2, 27.8};
        double maxTemp = temperatures[0];
        for(double temperature: temperatures){
            if(temperature > maxTemp){
                maxTemp = temperature;
            }
        }
        System.out.println(maxTemp);
    }
    
}
