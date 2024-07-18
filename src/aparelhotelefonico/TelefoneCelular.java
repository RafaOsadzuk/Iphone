package aparelhotelefonico;

public class TelefoneCelular implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("LIGANDO O CELULAR...");
    }

    public void atender(){
        System.out.println("ATENDENDO O CELULAR...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }
}
