import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var num = scanner.nextInt();

        for(var i = 1; i <= 10 ; i++){
            var result = i * num;
            System.out.println(num + " x " + i + " = " + result );
            
        }
    }
}
