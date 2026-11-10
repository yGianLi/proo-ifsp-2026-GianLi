package adapter;



public class Teste {
    static void main(String[] args) {
        ControDePonto ponto = new ControDePonto();
        Funcionario funcionario = new Funcionario("Teobaldo");

        ponto.registrarEntrada(funcionario);
        ponto.registrarSaida(funcionario);
    }
}
