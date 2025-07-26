
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // E lógico (AND)
        boolean resultado1 = a && b; // false
        // OU lógico (OR)
        boolean resultado2 = a || b; // true
        // NÃO lógico (NOT)
        boolean resultado3 = !a; // false

        // Impressão dos resultados
        System.out.println("AND (a && b): " + resultado1);
        System.out.println("OR (a || b): " + resultado2);
        System.out.println("NOT (!a): " + resultado3);
    }
}
