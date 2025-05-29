package gemini.day2;

public class MethodPractice {
    public static String printWelcomeMessage(){
        return "환영합니다! 자바 학습을 시작해볼까요?";
    }

    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static int findMax(int a, int b){
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        String msg = printWelcomeMessage();
        System.out.println(msg);

        double circleArea = calculateCircleArea(5.0);
        System.out.println(circleArea);

        int maxNum = findMax(15, 7);
        System.out.println(maxNum);


    }

    
}
