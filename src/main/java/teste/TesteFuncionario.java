package teste;

import Modelo.Funcionario;
import Modelo.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana", "123", 5000.0);

        System.out.println(f);

        Gerente g = new Gerente();
        System.out.println(g);
    }


}
