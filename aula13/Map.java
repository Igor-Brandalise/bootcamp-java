import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        
        // ---- HashMap ----
        Map<String, Integer> estoque = new HashMap<>();
        
        // Adicionando itens (chave = nome, valor = quantidade)
        estoque.put("Maçã", 10);
        estoque.put("Banana", 5);
        estoque.put("Laranja", 7);
        estoque.put("Banana", 8); // sobrescreve o valor da chave "Banana"

        System.out
