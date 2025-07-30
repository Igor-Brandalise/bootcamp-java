import java.util.Scanner;

public class nome {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);
        System.out.println("Qual o sem nome?");
        var nome = scanner.next();

        System.out.println("Qual ano você nasceu?");
        var nasceu = scanner.next();

        var idade = 2025 - Integer.parseInt(nasceu);

        System.out.printf("Olá %s você tem %s anos \n", nome, idade);

        scanner.close();
    }
}
