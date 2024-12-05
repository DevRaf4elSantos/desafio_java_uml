package funcionalidades.telefone;

public class Telefone {
    private Contato[] listaContatos = new Contato[500];

    private int i = -1;
    public Contato[] getListaContatos() {
        return listaContatos;
    }


    public void setListaContatos(Contato[] listaContatos) {
        this.listaContatos = listaContatos;
    }

    public void ligar(Contato contato) {
        System.out.println("Ligando para " + contato.getNome());
    }

    public void atenderLigação(boolean devoAtender) {
        System.out.println("Estão te ligando, você quer atender? Digite true ou false");
        atenderOuNão(devoAtender);
    }

    public void atenderOuNão(boolean atender) {
        if (atender) {
            System.out.println("Você atendeu a ligação");
        } else {
            System.out.println("Você não atendeu a ligação");
        }
    }

    public void salvarContato(Contato contato) {
        this.listaContatos[i + 1] = contato;
        i++;
    }
    public void editarConta(String nome, String novoNome){
        for(Contato dados : this.listaContatos){
            if(dados != null){
                if(dados.getNome().contains(nome)){
                    dados.setNome(novoNome);
                    System.out.println(dados.getNome() + " - " + dados.getNumero());
                    return;
                } else {
                    System.out.println("O contato desejado não foi encontrado");
                }
            } else {
                return;
            }



        }
    }

    public void mostrarLista(){
        System.out.println("Lista de contatos: ");

        for (Contato dados : this.listaContatos){
            if(dados == null){
                return;
            }else {
                System.out.println(dados.getNome() + " - " + dados.getNumero());
            }
        }
    }

}
