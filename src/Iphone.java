import funcionalidades.reprodutordemusica.Musica;
import funcionalidades.reprodutordemusica.ReprodutorMusica;

public class Iphone {
    public static void main(String[] args) {
        // Testando Package reprodutormusica
        // Criando Instâncias de Musica e setando um nome:
        Musica greatIAm = new Musica();
        greatIAm.setNome("great I am");

        Musica tearsOfTheSaints = new Musica();
        tearsOfTheSaints.setNome("Tears Of The Saints");
        // Criando uma lista de música:
        Musica[] listaMusica = {greatIAm, tearsOfTheSaints};
        // Criando um player de música:
        ReprodutorMusica vMusic = new ReprodutorMusica();
        // Setando um playList:
        vMusic.setPlaylist(listaMusica);
        //  Tocando uma música:
        vMusic.tocarMusica(greatIAm);
        // Criando uma playList:
        vMusic.criarPlayList(listaMusica, "Louvores Em Inglês!");
        // Tocando uma playList:
        vMusic.tocarPlayList("Louvores Em Inglês!");
        // Imprimindo a música atual
        System.out.println(vMusic.getMusicaAtual());
        // Trocando a música:
        vMusic.trocarMusica(greatIAm);
        // Verificando se mudou:
        System.out.println(vMusic.getMusicaAtual());

    }
}