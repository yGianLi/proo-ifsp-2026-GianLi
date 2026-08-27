package Aula.ArrayMatrizes;

public class ExemplosStrings {
    public static void main(String[] args) {
        String texto1 = "ifsp"; // string anônima
        String texto2 = "ifsp";
        String texto3 = new String("ifsp");

        System.out.println(texto1 == texto2);
        System.out.println(texto1 == texto3);

        // Exemplo 02
        // Classe String é imutável
        String frase1 = "Olá, ";
        String frase2 = frase1 + "turma!";

        System.out.println(frase2.toUpperCase());
        System.out.println(frase2);

        String linha = "    Duda;BV3077161Z;20;Computação;ND ";
        String proc1 = linha.trim();
        String proc2 = linha.stripLeading(); //rtrim (right trim)
        String proc3 = linha.stripTrailing(); //ltrim (left trim)
        System.out.println(proc1);
        System.out.println(proc2);
        System.out.println(proc3);

        //Atividade 03:
        String proc4 = proc1.replace("ND", "0");

        System.out.println(proc4);

        //Atividade 04:
        //Split retorna o array de String
        String [] campos = proc4.split(";"); //Pra conseguir um pedaço da String
        System.out.println(campos.length);
        for(String campo : campos){
            System.out.println(campo);
        }

        //Atividade 05:
        //Sub gera substrings e determina qual tamanho eu quero repartir

        int tamProntuario = 8;
        int posProntuario = proc4.indexOf(;);

        String sub = proc4.substring(2,10);
        System.out.println(proc4);
        System.out.println(sub);

        //Atividade 06:
        String bordao = "tudo bem? ";
        System.out.println(bordao.repeat(5));

        int posicao = proc4.indexOf("Z"); // procura se a ("variavel") está em qual posição
        System.out.println(posicao);

    }
}
