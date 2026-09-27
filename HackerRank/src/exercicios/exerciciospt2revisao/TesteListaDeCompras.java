package exercicios.exerciciospt2revisao;

public class TesteListaDeCompras {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();

        lista.adicionar(new Produto("Caderno", 15.90));
        lista.adicionar(new Produto("Caneta", 3.50));
        lista.adicionar(new Produto("Mochila", 89.90));

        lista.imprimirTodos();

        System.out.println("Total: R$ " + lista.calcularTotal());
    }
}
