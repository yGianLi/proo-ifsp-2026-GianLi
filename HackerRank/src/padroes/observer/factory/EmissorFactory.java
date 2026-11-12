package padroes.observer.factory;

public class EmissorFactory {

    public Emissor create(int tipo) {
        switch (tipo) {
            case EmissorFactory.EMAIL -> {
                return new EmissorEmail();
            }
            case EmissorFactory.SMS -> {
                return new EmissorSMS();
            }
            default -> {
                // throw new IllegalAccessException("Tipo de emissao");
            }
        }
        return null;
    }
    public static final int EMAIL = 0;
    public static final int SMS = 1;

}
