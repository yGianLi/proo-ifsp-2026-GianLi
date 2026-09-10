package entidades;

import exercicios.DataHora;

import javax.xml.crypto.Data;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        String nome = "marcio ricardo";
        p1.alterarIdade(30);
        p1.alterarNome("Jose Ricardo");

        System.out.println(p1.qualSeuNome());
        System.out.println(p1.qualSuaIdade());
        System.out.println(p1.qualUltimoNome());


        System.out.println(findDay(5,7,2015));

    }

}
