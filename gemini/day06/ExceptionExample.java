package gemini.day06;

public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int result =10/0;
            System.out.println("결과: "+result);
        }catch(ArithmeticException e){
            System.err.println("오류 발생! 0으로 나눌 수 없습니다");
            System.err.println(e.getMessage());
        }catch(NullPointerException e){
            System.err.println("Null pont exception"+ e.getMessage());
        }finally{
        System.err.println("예외처리 블록이 종료되었습니다");
        }
    }
    
}
