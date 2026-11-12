package padroes.observer.adapter;



public class Teste {
    static void main(String[] args) {
        ControDePonto ponto = new ControDePonto();
        Funcionario funcionario = new Funcionario("Teobaldo");

        ControleDePontoAdapter novo = new ControleDePontoAdapter();

        ponto.registrarEntrada(funcionario);
        ponto.registrarSaida(funcionario);

        novo.registrarEntrada(funcionario);
        novo.registrarSaida(funcionario);

    }
}
