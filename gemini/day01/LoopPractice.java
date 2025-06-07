package gemini.day01;
public class LoopPractice {
    public static void main(String[] args){
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지 합계: "+sum);

        for(int i=1; i<=9; i++){
        System.out.println("5 x "+i+ " = " +5*i);
        }

        int count = 5;
        while(count>=1){
            if(count ==1){
                System.out.println("발사");
            }
            count--;
        }

    }
}
