import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ricxvi = scanner.nextInt();


        for(int i = 1; i<=10; i++){
            int result = ricxvi * i;
            System.out.println(result);
        }
    }
}
