
public class OperadoresBitwise {
    public static void main(String[] args) {
        int a = 5;   // binário: 0101
        int b = 3;   // binário: 0011

        // AND: 0101 & 0011 = 0001 (1)
        int and = a & b;
        System.out.println("AND (a & b): " + and);

        // OR: 0101 | 0011 = 0111 (7)
        int or = a | b;
        System.out.println("OR (a | b): " + or);

        // XOR: 0101 ^ 0011 = 0110 (6)
        int xor = a ^ b;
        System.out.println("XOR (a ^ b): " + xor);

        // NOT: ~a = inverte todos os bits de 'a'
        int not = ~a;
        System.out.println("NOT (~a): " + not); // Resultado negativo (complemento de dois)

        // Shift à esquerda: 0101 << 1 = 1010 (10)
        int esquerda = a << 1;
        System.out.println("Shift Esquerda (a << 1): " + esquerda);

        // Shift à direita: 0101 >> 1 = 0010 (2)
        int direita = a >> 1;
        System.out.println("Shift Direita (a >> 1): " + direita);
    }
}

