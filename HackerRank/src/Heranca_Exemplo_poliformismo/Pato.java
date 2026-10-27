package Heranca_Exemplo_poliformismo;

public class Pato extends Animal{

    public Pato(double peso, String nome) {
        super(peso, nome);
    }
    public Pato(){
        super(6.0, "Pato");
    }

    public void emitirSom() {
        System.out.println("Quack Quack");
    }

}

