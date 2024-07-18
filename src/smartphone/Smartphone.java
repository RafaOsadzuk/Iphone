package smartphone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar(){
        System.out.println("LIGANDO O SMARTPHONE");
    }
    public void atender(){
        System.out.println("ATENDENDO O SMARTPHONE");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ DO SMARTPHONE");
    }

    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA NO CHROME DO SMARTPHONE");
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA NO CHROME DO SMARTPHONE");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO A PAGINA DO SMARTPHONE");
    }

    public void tocarMusica(){
        System.out.println("TOCANDO MUSICA NO SMARTPHONE");
    }
    public void pausarMusica(){
        System.out.println("PAUSANDO MUSICA NO SMARTPHONE");
    }
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MUSICA NO SMARTPHONE");
    }
}
