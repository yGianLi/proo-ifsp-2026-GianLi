package observer;

public class Jornal implements AcaoObserver {
    private String nome;

    public Jornal(String nome){
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(Acao acao){
        System.out.println("Jornal "+ nome + " foi notificado");
        System.out.println(acao.getTicker()+ ": R$ " + acao.getValor());
    }
}
