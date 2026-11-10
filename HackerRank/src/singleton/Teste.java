package singleton;

public class Teste {
    public static void main(String[] args) {
        ConexaoBanco banco = ConexaoBanco.getInstance();
        ConexaoBanco banco2 = ConexaoBanco.getInstance();



    }
}
