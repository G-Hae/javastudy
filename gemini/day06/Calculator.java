package gemini.day06;

public class Calculator {       
    public double divide(int a, int b){
        try{
            int tempResult = a / b; 
            return (double) tempResult;
        } catch(ArithmeticException e){
            System.out.println("오류: 0으로 나눌 수 없습니다.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double result1 = calc.divide(10, 2);
        System.out.println("10 / 2 = " + result1);

        double result2 = calc.divide(10, 0);
        System.out.println("10 / 0 = " + result2);

    }
}
