public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Cachorro
        Cachorro dog1 = new Cachorro("Rex", 3);
        Cachorro dog2 = new Cachorro("Luna", 5);

        // Usando métodos
        dog1.mostrarInfo();
        dog1.latir();

        System.out.println();

        dog2.mostrarInfo();
        dog2.latir();
    }
}

