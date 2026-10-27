package Heranca_Exemplo_poliformismo;

public class Radio implements Sonoro {
    @Override
    public void emitirSom() {
        System.out.println("Sintonizando 92.1");
    }

}
