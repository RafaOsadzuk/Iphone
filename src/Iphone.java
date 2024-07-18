import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;
import smartphone.Smartphone;

public class Iphone {
    
    public static void main(String[] args) {
        Smartphone sm = new Smartphone();

        AparelhoTelefonico aparelhoTelefonico = sm;
        NavegadorInternet navegadorInternet = sm;
        ReprodutorMusical reprodutorMusical = sm;

        System.out.println("APARELHOTELEFONICO");
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.println("NAVEGADOR");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        System.out.println("SPOTIFY");
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica();
    }
}
