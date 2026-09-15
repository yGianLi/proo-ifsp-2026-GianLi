package exercicios.encapsulamento;

public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public void setNome(String n) {
        if (n == null || n.isBlank()) {
            throw new IllegalArgumentException("Campo nome vazio ou nulo!");
        }
        nome = n;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        if( p >= 0){
            preco = p;
        }else{
            System.out.println("Preço Negativo!");
        }
    }




}
