package gemini.day05;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + " and you are "+age+"years old");

        scanner.close();
    }
}
