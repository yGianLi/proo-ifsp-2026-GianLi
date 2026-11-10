package observer;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String ticker; //PETR4
    private double valor;
    private List<AcaoObserver> interessados;

    public Acao(String ticker, double valor){
        this.ticker = ticker;
        this.valor = valor;
        this.interessados = new ArrayList<>();
    }

    public double getValor(){
        return valor;
    }

    public String getTicker() {
        return ticker;
    }



}
