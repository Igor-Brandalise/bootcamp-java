public class Main {
    public static void main(String[] args) {
        // Criando objetos do tipo Pessoa
        Pessoa p1 = new Pessoa("Igor", 22);
        Pessoa p2 = new Pessoa("Maria", 30);

        // Usando método do record
        p1.mostrarInfo();
        p2.mostrarInfo();

        // Usando métodos padrão do record
        System.out.println(p1.nome()); // Getter automático
        System.out.println(p1.idade());
        System.out.println(p1); // toString automático
    }
}
