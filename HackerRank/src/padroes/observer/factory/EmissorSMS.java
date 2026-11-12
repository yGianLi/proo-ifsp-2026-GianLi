package padroes.observer.factory;

public class EmissorSMS implements Emissor{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
