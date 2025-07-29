public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Adição
        int soma = a + b;
        System.out.println("Adição (a + b): " + soma); // 13

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração (a - b): " + subtracao); // 7

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação (a * b): " + multiplicacao); // 30

        // Divisão
        int divisao = a / b;
        System.out.println("Divisão (a / b): " + divisao); // 3 (divisão inteira)

        // Módulo (resto da divisão)
        int resto = a % b;
        System.out.println("Módulo (a % b): " + resto); // 1
    }
}
