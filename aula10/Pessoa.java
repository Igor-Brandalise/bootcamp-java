// Definindo um record
public record Pessoa(String nome, int idade) {
    // Você pode adicionar métodos se quiser
    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}