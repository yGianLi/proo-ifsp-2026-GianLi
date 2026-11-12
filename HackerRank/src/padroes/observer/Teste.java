package padroes.observer;

public class Teste {
    static void main(String[] args) {
        Acao petro = new Acao("PETR4", 44.76);
        Acao vale = new Acao("VALE3", 65.11);

        Corretora xp = new Corretora("XP");
        Corretora btg = new Corretora("BTG");

        Jornal valor = new Jornal("Valor econômico");

        petro.registraInteresses(xp);
        petro.registraInteresses(btg);
        petro.registraInteresses(valor);

        vale.registraInteresses(btg);

        petro.setValor(40);

        vale.setValor(60);
    }
}
