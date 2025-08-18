// Classe
public class Cachorro {
    // Atributos (características)
    String nome;
    int idade;

    // Construtor (para criar o objeto já com valores)
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método (comportamento)
    public void latir() {
        System.out.println(nome + " diz: Au Au!");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}
