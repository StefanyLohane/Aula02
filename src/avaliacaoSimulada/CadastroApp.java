package avaliacaoSimulada;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Musica musica3 = new Musica(12,"Meio a Meio II","TheGust", 120,"Nacional");

        musica1.id = 10;
        musica1.titulo = "Telephones"; 
        musica1.artista = "Vacations";
        musica1.duracaoSeg = 234;
        musica1.genero = "Internacional";
        
        musica2.id = 11;
        musica2.titulo = "Só depois"; 
        musica2.artista = "Grupo Revelação";
        musica2.duracaoSeg = 200;
        musica2.genero = "Pagode";

        List<Musica> listaMusicas = new ArrayList<>();
        listaMusicas.add(musica1);
        listaMusicas.add(musica2);
        listaMusicas.add(musica3);

        Playlist playlist = new Playlist(7,"Favoritas",true, 3,554 , LocalDateTime.now(), listaMusicas);


        //Imprimindo
        System.out.println("*** CUPOM FISCAL ***");
        System.out.println("\nID: " + playlist.id);
        System.out.println("Nome:: " + playlist.nome);
        System.out.println("Publica: " + playlist.publica);
        System.out.println("Total de músicas: " + playlist.totalMusicas);
        System.out.println("Duração total de segundos: " + playlist.duracaoTotalSeg);
        System.out.println("Data da criação: " + playlist.dataCriacao);
        //System.out.println("Músicas: " + playlist.musicas);

        //Iterar(percorrer) a lista com for each
        for(Musica m : playlist.musicas){
        
        System.out.println("\nID: " + m.id );
        System.out.println("Título: " + m.titulo );
        System.out.println("Artista: " + m.artista );
        System.out.println("Duração em segundos: " + m.duracaoSeg );
        System.out.println("Gênero: " + m.genero );
        }
    }
}