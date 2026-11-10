package factory;

public class TesteEmissorFactory {
    static void main() {
        EmissorFactory fabrica = new EmissorFactory();

        Emissor email = fabrica.create(EmissorFactory.EMAIL);
        email.enviar("Não vai acabar a aula??");

        Emissor sms = fabrica.create(EmissorFactory.SMS);
        sms.enviar("Acho que está acabando aula...");
    }
}
