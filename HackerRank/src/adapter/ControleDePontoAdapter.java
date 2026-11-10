package adapter;

public class ControleDePontoAdapter extends ControDePonto{

    private ControleDePontoNovo controle;

    public ControleDePontoAdapter() {
        controle = new ControleDePontoNovo();
    }

    @Override
    public void registrarEntrada(Funcionario f) {
        controle.registrarPonto(f, true);
    }

    @Override
    public void registrarSaida(Funcionario f) {
        controle.registrarPonto(f, false);
    }
}
