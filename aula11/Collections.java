import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // ----- LIST -----
        // Lista que permite elementos duplicados e mantém a ordem de inserção
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Ana");
        listaNomes.add("Carlos");
        listaNomes.add("Ana"); // duplicado permitido
        System.out.println("Lista: " + listaNomes);

        // Percorrendo a lista
        for (String nome : listaNomes) {
            System.out.println("Nome: " + nome);
        }


        // ----- SET -----
        // Conjunto que não permite elementos duplicados
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(10); // duplicado não será adicionado
        System.out.println("Set: " + numeros);

        // Verificando se contém um número
        System.out.println("Set contém 20? " + numeros.contains(20));


        // ----- MAP -----
        // Estrutura chave-valor (como um dicionário)
        Map<String, Integer> idadePessoas = new HashMap<>();
        idadePessoas.put("João", 25);
        idadePessoas.put("Maria", 30);
        idadePessoas.put("Pedro", 20);

        // Acessando valores pela chave
        System.out.println("Idade da Maria: " + idadePessoas.get("Maria"));

        // Iterando sobre o mapa
        for (Map.Entry<String, Integer> entry : idadePessoas.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }


        // ----- COLLECTIONS -----
        // Métodos utilitários para coleções
        Collections.sort(listaNomes); // ordena a lista
        System.out.println("Lista ordenada: " + listaNomes);

        int max = Collections.max(numeros); // pega o maior do set
        System.out.println("Maior número no Set: " + max);
    }
}
