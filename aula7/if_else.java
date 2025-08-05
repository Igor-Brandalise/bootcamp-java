
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);
        System.out.println("Qual sua idade");
        var age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("Você tem %s anos \n", age);
        }

    }
}
