import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        while (userGuess != randomNumber) {
            userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("too low");
            } else if (userGuess > randomNumber) {
                System.out.println("too high");
            } else if (userGuess == randomNumber){
                System.out.println("correct");
            }
        }
    }
}
