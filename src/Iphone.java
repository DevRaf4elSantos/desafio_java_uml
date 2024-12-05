import funcionalidades.navegador.Navegador;
import funcionalidades.navegador.Site;
import funcionalidades.reprodutordemusica.Musica;
import funcionalidades.reprodutordemusica.ReprodutorMusica;
import funcionalidades.telefone.Contato;
import funcionalidades.telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
//        // Testando Package reprodutormusica
//        // Criando Instâncias de Musica e setando um nome:
//        Musica greatIAm = new Musica();
//        greatIAm.setNome("great I am");
//
//        Musica tearsOfTheSaints = new Musica();
//        tearsOfTheSaints.setNome("Tears Of The Saints");
//        // Criando uma lista de música:
//        Musica[] listaMusica = {greatIAm, tearsOfTheSaints};
//        // Criando um player de música:
//        ReprodutorMusica vMusic = new ReprodutorMusica();
//        // Setando um playList:
//        vMusic.setPlaylist(listaMusica);
//        //  Tocando uma música:
//        vMusic.tocarMusica(greatIAm);
//        // Criando uma playList:
//        vMusic.criarPlayList(listaMusica, "Louvores Em Inglês!");
//        // Tocando uma playList:
//        vMusic.tocarPlayList("Louvores Em Inglês!");
//        // Imprimindo a música atual
//        System.out.println(vMusic.getMusicaAtual());
//        // Trocando a música:
//        vMusic.trocarMusica(greatIAm);
//        // Verificando se mudou:
//        System.out.println(vMusic.getMusicaAtual());

        Site google = new Site();
        google.setUrl("www.google.com.br");
        Site facebook = new Site();
        facebook.setUrl("www.facebook.com.br");

        Navegador chrome = new Navegador();

        chrome.pesquisar(facebook);

        chrome.abrirNovaAba();
        chrome.pesquisar(facebook);
        chrome.pesquisar(google);
        chrome.pesquisar(google);
        chrome.pesquisar(facebook);
        chrome.pesquisar(google);

        chrome.exibirHistorico();

        chrome.limparPesquisa();

        chrome.exibirHistorico();

        Contato rembert = new Contato();
        rembert.setNome("Rembert VanDamme");
        rembert.setNumero("1190807060");

        Contato erick = new Contato();
        erick.setNome("Erick Silva");
        erick.setNumero("1180908070");

        Telefone discador = new Telefone();
        discador.salvarContato(rembert);
        discador.salvarContato(erick);
        discador.editarConta("Rembert VanDamme", "Nilbert Elves");
        discador.mostrarLista();
    }
}