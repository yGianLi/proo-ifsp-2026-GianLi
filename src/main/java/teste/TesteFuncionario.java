package teste;

import Modelo.Desenvolvedor;
import Modelo.Funcionario;
import Modelo.Gerente;

import java.util.ArrayList;

public class TesteFuncionario {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("Ana", "123", 15_000.0, 10);

    Desenvolvedor dev1 = new Desenvolvedor("Jonas", "456", 3_000.0, "PHP");
    Desenvolvedor dev2 = new Desenvolvedor("Gian", "888", 4_500.0, "JAVA");

    Funcionario office = new Funcionario("Tiago", "458", 2_000.0);


        ArrayList<Funcionario> equipe = new ArrayList<>();
        equipe.add(dev1);
        equipe.add(dev2);
        equipe.add(office);
        equipe.add(gerente);

        for(Funcionario f : equipe){
            System.out.println("=".repeat(10));
            System.out.println(f.toString());
        }

        double totalFolha = 0.0;
        System.out.println("=".repeat(10));
        for(Funcionario f: equipe){
            double salario = f.getSalario();
            totalFolha += salario;
            System.out.println(f.getNome() + " => " + salario);
        }
        System.out.println("TOTAL => " + totalFolha);

    }



}
