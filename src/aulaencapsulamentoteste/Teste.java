package aulaencapsulamentoteste;

import aula1508encapsulamento.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(-16); //aparece 0 pois elwe representa nulo!
        p.setNome("Stefany Lohane");

        System.out.println("Nome:" + p.getNome() );
        System.out.println("Idade:" + p.getIdade() );
    }
    
}
