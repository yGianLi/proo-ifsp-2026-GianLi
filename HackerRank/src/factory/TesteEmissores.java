package factory;

public class TesteEmissores {
    static void main(String[] args) {
        Emissor email = new EmissorEmail();
        email.enviar("A aula não acaba nunca!!");

        Emissor sms = new EmissorSMS();
        sms.enviar("Que horas são??");
    }
}
