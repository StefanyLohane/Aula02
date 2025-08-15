package avaliacaoI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadstroApp {
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao();
        Transacao transacao2 = new Transacao(11,"Depósito",1200.00,LocalDateTime.now(),"Operação finalizada");
        Transacao transacao3 = new Transacao(12,"Saque", 600.00,LocalDateTime.now(),"Operação cancelada");

        transacao1.id = 10;
        transacao1.tipo = "Saque";
        transacao1.valor = 300.00;
        transacao1.dataHora = LocalDateTime.now();
        transacao1.status = "Em andamento";

        List<Transacao> listaTransacoes = new ArrayList<>();
        listaTransacoes.add(transacao1);
        listaTransacoes.add(transacao2);
        listaTransacoes.add(transacao3);

        ContaBancaria contaBancaria = new ContaBancaria(16,"Stefany Lohane","01112008","2025-3",2100.00,30000,"Corrente", listaTransacoes);

         //Imprimindo a conta bancária:
        System.out.println("---> CUPOM FISCAL <---");
        System.out.println("\nID: " + contaBancaria.id);
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Número: " + contaBancaria.numero);
        System.out.println("Agência: " + contaBancaria.agencia);
        System.out.println("Saldo: " + contaBancaria.saldo);
        System.out.println("Limite: " + contaBancaria.limite);
        System.out.println("Tipo: " + contaBancaria.tipo);
        //System.out.println("Transações: " + contaBancaria.transacoes);

        //Iterar(percorrer) a lista com for each para imprimir as transações:
        for(Transacao t : contaBancaria.transacoes){
        System.out.println("\nID: " + t.id );
        System.out.println("Tipo: " + t.tipo );
        System.out.println("Valor: " + t.valor );
        System.out.println("Data e hora: " + t.dataHora );
        System.out.println("Status: " + t.status );
        }

    }
    
}