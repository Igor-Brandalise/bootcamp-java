import java.util.*;

public class Set {
    public static void main(String[] args) {

        // ---- HashSet ----
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // duplicado (não será adicionado)

        System.out.println("HashSet (sem ordem garantida): " + frutas);


        // ---- LinkedHashSet ----
        Set<String> carros = new LinkedHashSet<>();
        carros.add("BMW");
        carros.add("Audi");
        carros.add("Fiat");
        carros.add("Audi"); // duplicado ignorado

        System.out.println("LinkedHashSet (ordem de inserção): " + carros);


        // ---- TreeSet ----
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10); // duplicado ignorado

        System.out.println("TreeSet (ordenado): " + numeros);
