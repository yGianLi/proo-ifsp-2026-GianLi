package Loja;

public class Item {
    private String produto;
    private double preco;
    private int qtde;
}

public Item(String produto, double preco, int qtde){
    this.produto = produto;
    this.preco = preco;
    this.qtde = qtde;
}



public double totalItem(double preco, int qtde){
    return preco*qtde;
}


