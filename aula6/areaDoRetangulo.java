import java.util.Scanner;

public class areaDoRetangulo {
        public static void main(String[] args) {
         @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);
        System.out.println("insira a medida do altura de um retângulo:");
        var altura = scanner.next();

        System.out.println("insira a medida da base de um retângulo:");
        var base = scanner.next();

        var area = Integer.parseInt(altura) * Integer.parseInt(base);

        System.out.printf("A área do retângulo é = %s \n", area);

        scanner.close();
    }
}
