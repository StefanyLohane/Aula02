package avaliacaoI;

import java.util.List;

public class ContaBancaria {
    int id;
    String titular;
    String numero;
    String agencia;
    double saldo;
    double limite;
    String tipo; // Corrente ou poupança
    List<Transacao> transacoes;

        ContaBancaria(){
        System.out.println("Chamou o contrutor vazio!");
    }

    ContaBancaria(int id, String titular, String numero, String agencia, double saldo, double limite, String tipo, List<Transacao> transacoes){
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
        this.transacoes = transacoes;

    }
}