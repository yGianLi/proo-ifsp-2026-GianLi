package Loja;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate data;
    private ArrayList<Item> item = new ArrayList<>();
}

public Pedido(int id, LocalDate data){
    this.id = id;
    this.data = data;
}



public double totalPedido(int id, LocalDate data){
    return ;
}
