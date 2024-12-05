package funcionalidades.reprodutordemusica;

public class ReprodutorMusica {
    private String musicaAtual;
    private String statusAtual;
    private Musica[] playlist;
    private String nomePlaylist;

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public Musica[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Musica[] playlist) {
        this.playlist = playlist;
    }

    public String getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(String statusAtual) {
        this.statusAtual = statusAtual;
    }

    public void tocarMusica(Musica musica){
        this.statusAtual = "tocando";
        this.musicaAtual = musica.getNome();
        System.out.println("Tocando agora: " + musica.getNome());
    }

    public void pararMusica(Musica musica){
        this.statusAtual = "pausada";
        System.out.println("Parando de tocar a musica");
    }

    public void trocarMusica(Musica musica){
        this.musicaAtual = musica.getNome();
    }

    public void criarPlayList(Musica[] musicas, String nomePlayList){
        this.nomePlaylist = nomePlayList;
        this.playlist = musicas;
        System.out.println("Nova playList criada com sucesso");
    }

    public void tocarPlayList(String nomePlaylist){
        if(nomePlaylist == this.nomePlaylist){
            for (Musica musica : playlist){
                this.musicaAtual = musica.getNome();
                System.out.println("A musica tocando atualmente é: " + musica.getNome());
            }
        } else {
            System.out.println("infelizmente não conseguimos encontrar a playlist desejada!");
        }
    }
}
