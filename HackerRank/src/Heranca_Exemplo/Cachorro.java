package Heranca_Exemplo;

public class Cachorro extends Animal {

    public Cachorro(double peso, String nome) {
        super(peso, nome);
    }

    public Cachorro(){
        super(5.0, "Cachorro");
    }

    public void emitirSom() {
        System.out.println("Au Au");
    }

}
