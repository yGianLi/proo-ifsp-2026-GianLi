package entidades;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        String nome = "marcio ricardo";
        p1.alterarIdade(30);
        p1.alterarNome("Jose Ricardo");

        System.out.println(p1.qualSeuNome());
        System.out.println(p1.qualSuaIdade());
        System.out.println(p1.qualUltimoNome());

    }

}
