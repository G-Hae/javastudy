package gemini.day06;
import java.io.IOException;

public class ThrowsThrowExample {
    public static void readFile(String filePath) throws IOException{
        if(filePath == null || filePath.isEmpty()){
            throw new IllegalArgumentException("파일 경로가 비어있을 수 없습니다");
        }
        System.out.println(filePath + " 파일을 읽는 중..");
    }
    
public static void main(String[] args) {
    try{
        readFile("myfile.txt");
        readFile(null);
    } catch(IOException e){
        System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
    } catch(IllegalArgumentException e){
        System.out.println("잘못된 인자 오류 " + e.getMessage());
    } finally{
        System.out.println("메인 메서드 예외 처리 종료!");
    }
}
}


