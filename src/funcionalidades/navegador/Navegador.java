package funcionalidades.navegador;

public class Navegador {
    private int qtdAbasAbertas;
    private String[] historicoPesquisa = new String[100];
    private int contador = -1;

    public int getQtdAbasAbertas() {
        return qtdAbasAbertas;
    }

    public void setQtdAbasAbertas(int qtdAbasAbertas) {
        if (qtdAbasAbertas >= 0) {
            this.qtdAbasAbertas = qtdAbasAbertas;
        }
    }

    public String[] getHistoricoPesquisa() {
        return historicoPesquisa;
    }

    public void setHistoricoPesquisa(String[] historicoPesquisa) {
        this.historicoPesquisa = historicoPesquisa;
    }

    public void abrirNovaAba() {
        if (this.qtdAbasAbertas < 100) {
            this.qtdAbasAbertas++;
        } else {
            System.out.println("Você alcançou o limite de Abas! Tente fechar alguma aba!");
        }
    }

    public void fecharAba() {
        if (this.qtdAbasAbertas > 0) {
            this.qtdAbasAbertas--;
        } else {
            System.out.println("Não há abas abertas no momento");
        }
    }

    public void pesquisar(Site site) {
        if (this.qtdAbasAbertas < 1) {
            System.out.println("Para fazer a pesquisa é nescessário que abra uma aba");
        } else {
            if ((this.contador + 1) < 99) {
                System.out.println("Buscando o site " + site.getUrl());
                this.historicoPesquisa[this.contador + 1] = site.getUrl();
                this.contador++;
            } else {
                System.out.println("Você precisa excluir o seu histórico");
            }
        }


    }

    public void limparPesquisa() {
        this.historicoPesquisa = new String[100];
        System.out.println("Seu histórico foi excluido");
    }

    public void exibirHistorico() {
        if (this.historicoPesquisa[0] != null) {
            System.out.println("Seu Histórico:");
            for (String historico : this.historicoPesquisa) {
                if (historico == null) {
                    return;
                } else {
                    System.out.println(historico);
                }
            }
        } else {
            System.out.println("Não encontramos nenhum histórico de pesquisa!");
        }
    }
}
