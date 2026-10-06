package exercicios.exerciciospt2revisao;

public class LeitorLinhaCSV {
    public static void main(String[] args) {
        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

        String[] campos = linha.split(",");

        System.out.println("campos[0]: " + campos[0]);
        System.out.println("campos[1]: " + campos[1]);
        System.out.println("campos[2]: " + campos[2]);

        // linha.equalsIgnoreCase(outraLinha), imprimindo os dois resultados
        System.out.println("equals: " + linha.equals(outraLinha));
        System.out.println("equalsIgnoreCase: " + linha.equalsIgnoreCase(outraLinha));

        // "Nome: Maria | Idade: 28 anos | Status: ATIVO"
        // a partir das posições do array obtido no TODO 1
        String frase = String.format("Nome: %s | Idade: %s anos | Status: %s",
                campos[0], campos[1], campos[2]);
        System.out.println(frase);
    }
}
