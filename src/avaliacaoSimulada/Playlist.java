package avaliacaoSimulada;

import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
    int id;
    String nome;
    boolean publica;
    int totalMusicas;
    int duracaoTotalSeg; 
    LocalDateTime dataCriacao;
    List<Musica> musicas;

    public Playlist(){
        System.out.println("Chamou o contrutor vazio!");
    }

    public Playlist(int id, String nome, boolean publica, int totalMusicas, int duracaoTotalSeg, LocalDateTime dataCriacao, List<Musica> musicas){
        this.id = id;//this é pra acessar na raíz da classe
        this.nome = nome;
        this.publica = publica;
        this.totalMusicas = totalMusicas;
        this.duracaoTotalSeg = duracaoTotalSeg;
        this.dataCriacao = dataCriacao;
        this.musicas = musicas;
    }
}