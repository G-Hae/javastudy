public class ConditionalPractice {
    public static void main(String[] args){
        int score = 78;

        if(score >=90){
            System.out.println("A 학점");
        } else if(score >=80){
            System.out.println("B 학점");
        } else if(score >=70){
            System.out.println("C 학점");
        } else if(score >=60){
            System.out.println("D 학점");
        } else{
            System.out.println("F 학점");
        }

        int dayOfWeek = 3;

        switch(dayOfWeek){
            case 1,2,3,4,5:
            System.out.println("오늘은 평일입니다.");
            break;
            case 6, 7:
            System.out.println("오늘은 주말입니다.");
            break;
            default:
            System.out.println("잘못된 요일 숫자입니다.");
        }
    }
}
