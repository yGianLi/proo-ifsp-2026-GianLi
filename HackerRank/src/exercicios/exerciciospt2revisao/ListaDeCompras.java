package exercicios.exerciciospt2revisao;

import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void imprimirTodos() {
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }
}
