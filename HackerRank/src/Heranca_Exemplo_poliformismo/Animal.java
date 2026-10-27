package Heranca_Exemplo_poliformismo;

public abstract class Animal implements Sonoro{
    private double peso;
    private String nome;


    public Animal(double peso, String nome){
        this.peso = peso;
        this.nome = nome;
    }
    public Animal(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void emitirSom(){
        System.out.println("abu...");;
    }

}