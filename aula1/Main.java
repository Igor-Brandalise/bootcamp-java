package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");

        var nome = scanner.next();
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.printf("Olá %s sua idade é %s \n", nome, idade);

        // OU System.out.printf(" Olá " + nome + " Sua idade é a" + idade);

    }
}
