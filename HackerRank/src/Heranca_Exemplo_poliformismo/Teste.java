package Heranca_Exemplo_poliformismo;

import java.util.ArrayList;

public class Teste {
    static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        Pato p = new Pato();
        animais.add(g);
        animais.add(c);
        animais.add(p);

        for(Animal a : animais){
            a.emitirSom();
        }

        Radio r = new Radio();
        ArrayList<Sonoro> barulhentos = new ArrayList<>();
        barulhentos.add(r);
        barulhentos.add(g);
        barulhentos.add(p);
        barulhentos.add(c);

        System.out.println("=".repeat(20));

        for(Sonoro a : barulhentos){
            a.emitirSom();
        }

    }
}
