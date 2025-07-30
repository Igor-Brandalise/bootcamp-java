import java.util.Scanner;

public class diferencaDeIdade {
        public static void main(String[] args) {
         @SuppressWarnings("resource")
        var scanner = new Scanner(System.in);
        System.out.println("insira a idade de uma pessoa:");
        var idade1 = scanner.next();

        System.out.println("insira a idade de outra pessoa:");
        var idade2 = scanner.next();

        var diferenca = Integer.parseInt(idade1) - Integer.parseInt(idade2);

        if(diferenca < 0 ){
            diferenca  = diferenca * -1;
        }
 
            System.out.printf("A diferença de idade entre as duas pessoas é: %s \n", diferenca);
        scanner.close();
    }
}
