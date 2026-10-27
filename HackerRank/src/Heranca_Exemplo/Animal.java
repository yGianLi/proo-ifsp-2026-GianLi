package Heranca_Exemplo;

public class Animal {
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

    public void emitirSom(){
        System.out.println("dksakjdoa");;
    }

}