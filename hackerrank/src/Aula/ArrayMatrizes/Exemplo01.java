package Aula.ArrayMatrizes;

import java.util.Arrays;

public class Exemplo01 {

    public static void main(String[] args) {
        // alocação estática = valor não muda, ele é exato na hora que é declarado
        // tipo [] nome = new tipo [tamanho]
        boolean[] sensores = new boolean[5];

        // 4° para true

        sensores[3] = true;

        // for(inicio; condicao de parada; passo)
        for(int i = 0; i < sensores.length; i++){ // tipo.length significa o tamanho do array
            System.out.println(sensores[i]);
        }
        System.out.println("-----------------");
        // for enhanced
        // for(variavel : array)

        for(boolean sensor : sensores){ // mesma coisa de sensor == sensores[i], fazendo a comparação, apenas leitura
            System.out.println(sensor);
        }
        System.out.println("-----------------");
        System.out.println(Arrays.toString(sensores)); // printa os valores dos arrys desta forma = [0, 1, 2, 3, 4]

        // sensores[5] = true;
        // vai dar erro e da "ArrayIndexOutBoundsException" que o array está fora dos parâmetros do array;

    }


}
