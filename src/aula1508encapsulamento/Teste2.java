package aula1508encapsulamento;

public class Teste2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(16);
        p.setNome("Stefany Lohane");

        System.out.println("Nome:" + p.getNome() );
        System.out.println("Idade:" + p.getIdade() );

    }
}
