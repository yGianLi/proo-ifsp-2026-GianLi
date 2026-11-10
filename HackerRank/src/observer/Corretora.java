package observer;

public class Corretora implements AcaoObserver{
    private String nome;

    public Corretora(String nome){
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println("Corretora " + nome + " foi notificada.");
        System.out.println(acao.getTicker() + ": R$ " + acao.getValor());
    }
}
