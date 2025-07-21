package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");

        String nome = scanner.next();
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.printf("Olá" + nome + "Sua idade é " + idade);

        // OU  System.out.println("Olá %s sua idade é %s", nome, idade);
    }
}
