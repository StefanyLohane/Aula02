package avaliacaoI;

import java.time.LocalDateTime;

public class Transacao {
    int id;
    String tipo; // Saque ou depósito
    double valor;
    LocalDateTime dataHora;
    String status; // Cancelada ou finalizada

    Transacao(){
        System.out.println("Chamou o contrutor vazio!");
    }

    Transacao(int id, String tipo, double valor, LocalDateTime dataHora, String status){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.status = status;
    }
}