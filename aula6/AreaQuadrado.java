import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);
        System.out.println("insira a medida do lado de um quadrado:");
        var lado = scanner.next();
        var area = Integer.parseInt(lado) * Integer.parseInt(lado);

        System.out.printf("A área do quadrado é = %s \n", area);

        scanner.close();
    }
}
