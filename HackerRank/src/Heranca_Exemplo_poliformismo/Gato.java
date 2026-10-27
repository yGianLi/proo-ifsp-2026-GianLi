package Heranca_Exemplo_poliformismo;

public class Gato extends Animal{

    public Gato(double peso, String nome) {
        super(peso, nome);
    }
    public Gato(){
        super(3.0, "gato");
    }


    public void emitirSom() {
        System.out.println("Miau Miau");
    }

}

