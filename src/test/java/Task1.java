import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score>=90 && score<=100){
            System.out.println("A");
        } else if (score>=80 && score<=89) {
            System.out.println("B");
        } else if (score>=70 && score<=79) {
            System.out.println("C");
        } else if (score>=60 && score<=69) {
            System.out.println("D");
        } else if (score<60){
            System.out.println("F");
        }
    }
}
