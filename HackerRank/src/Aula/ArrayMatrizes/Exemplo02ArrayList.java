package Aula.ArrayMatrizes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exemplo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<>();

        bandas.add("Led Zepplin");
        bandas.add("Red Hot");
        bandas.add("Nickelback");
        bandas.add("Tonico e Tinoco");
        bandas.add("Veigh");
        bandas.add("Sotam");

        Collections.sort(bandas);

        for(String banda : bandas) {
            System.out.println(banda);
        }
    }
}
